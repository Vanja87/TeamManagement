package com.teammanager.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clients")
public class Clients {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
//	@OneToOne(fetch = FetchType.LAZY)
//	@PrimaryKeyJoinColumn
//	private Set<Projects> projects;
		
	@Column(name="name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="clientFirstName")
	private String clientFirstName;
	
	@Column(name="clientLastName")
	private String clientLastName;
	
	@Column(name="companyName")
	private String companyName;
	
	@Column(name="clientCity")
	private String clientCity;
	
	@Column(name="clientState")
	private String clientState;
	
	@Column(name="clientSince")
	private Date clientSince;
	
	public int getId() {
		return this.id;
	}
	
	public void setId(final int id) {
		this.id = id;
	}
	
//	public Set<Projects> getProjects() {
//		return this.projects;
//	}
//	
//	public void setProjects(final Set<Projects> projects) {
//		this.projects = projects;
//	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public String getClientFirstName() {
		return this.clientFirstName;
	}

	public void setClientFirstName(final String clientFirstName) {
		this.clientFirstName = clientFirstName;
	}

	public String getClientLastName() {
		return this.clientLastName;
	}

	public void setClientLastName(final String clientLastName) {
		this.clientLastName = clientLastName;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(final String companyName) {
		this.companyName = companyName;
	}

	public String getClientCity() {
		return this.clientCity;
	}

	public void setClientCity(final String clientCity) {
		this.clientCity = clientCity;
	}

	public String getClientState() {
		return this.clientState;
	}

	public void setClientState(final String clientState) {
		this.clientState = clientState;
	}

	public Date getClientSince() {
		return this.clientSince;
	}

	public void setClientSince(final Date clientSince) {
		this.clientSince = clientSince;
	}

}
