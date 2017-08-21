package com.teammanager.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * Entity bean with JPA annotations
 * Hibernate provides JPA implementation
 * @author Aki
 *
 */
@Entity
@Table(name="projects")
public class Projects {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;

	@OneToOne
	@PrimaryKeyJoinColumn
	private Team team;
	
	@Column(name="description")
	private String description;
	
	@Column(name="status")
	private String status;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Users createdByUser;
	
	@Column(name="createdDate")
	private Date createdDate;
	
	@ManyToOne(optional = false)
    @JoinColumn(name="clientId")
	private Clients client;
	
	@Column(name="timeSpent")
	private Date timeSpent;
	
	@Column(name="expences")
	private String expences;

	public int getId() {
		return this.id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

//	public Set<Team> getTeams() {
//		return teams;
//	}
//
//	public void setTeams(Set<Team> teams) {
//		this.teams = teams;
//	}
	public Team getTeams() {
		return this.team;
	}

	public void setTeams(final Team team) {
		this.team = team;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(final String status) {
		this.status = status;
	}

	public Users getCreatedByUser() {
		return createdByUser;
	}

	public void setCreatedByUser(final Users createdByUser) {
		this.createdByUser = createdByUser;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(final Date createdDate) {
		this.createdDate = createdDate;
	}

	public Clients getClient() {
		return client;
	}

	public void setClient(final Clients client) {
		this.client = client;
	}

	public Date getTimeSpent() {
		return this.timeSpent;
	}
	
	public void setTimeSpent(final Date timeSpent) {
		this.timeSpent = timeSpent;
	}

	public String getExpences() {
		return this.expences;
	}

	public void setExpences(String expences) {
		this.expences = expences;
	}

}
