package com.teammanager.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "users")
public class Users {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="userEmail")
	private String userEmail;

	@Column(name="userPassword")
	private String userPassword;

	@Column(name="userFirstName")
	private String userFirstName;

	@Column(name="userLastName")
	private String userLastName;

	@Column(name="userCity")
	private String userCity;

	@Column(name="userState")
	private String userState;

	@Column(name="userZip")
	private String userZip;
	
	@OneToOne(mappedBy="createdByUser")
	@Cascade(value=org.hibernate.annotations.CascadeType.SAVE_UPDATE)
	private Projects projects;
	
	@OneToOne
	@PrimaryKeyJoinColumn
    private Team team;
	
	@OneToOne(mappedBy="user")
	@Cascade(value=org.hibernate.annotations.CascadeType.SAVE_UPDATE)
	private Tasks tasks;
	
	@Column(name="userRegistrationDate")
	private Date userRegistrationDate;

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(final String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(final String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(final String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(final String userCity) {
		this.userCity = userCity;
	}

	public String getUserState() {
		return userState;
	}

	public void setUserState(final String userState) {
		this.userState = userState;
	}

	public String getUserZip() {
		return userZip;
	}

	public void setUserZip(final String userZip) {
		this.userZip = userZip;
	}

	public Projects getProjects() {
		return projects;
	}

	public void setProjects(final Projects projects) {
		this.projects = projects;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(final Team team) {
		this.team = team;
	}

	public Tasks getTasks() {
		return tasks;
	}

	public void setTasks(final Tasks tasks) {
		this.tasks = tasks;
	}

	public Date getUserRegistrationDate() {
		return userRegistrationDate;
	}

	public void setUserRegistrationDate(final Date userRegistrationDate) {
		this.userRegistrationDate = userRegistrationDate;
	}

}
