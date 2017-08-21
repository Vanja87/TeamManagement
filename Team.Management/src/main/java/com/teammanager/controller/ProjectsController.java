package com.teammanager.controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.teammanager.model.Projects;
import com.teammanager.model.Users;
import com.teammanager.service.ProjectsService;
import com.teammanager.service.UsersService;

@Scope("request")
@Component
public class ProjectsController implements Serializable {

	private static final long serialVersionUID = 2614985191337857662L;
	
	private static final String ADD_DESTINATION = "compositions/addProjects.xhtml?faces-redirect=true&includeViewParams=true";

	private static final String PROJECTS_TABLE = "compositions/projectsTable.xhtml?faces-redirect=true&includeViewParams=true";

	@Autowired
	private ProjectsService projectsService;
	@Autowired
	private UsersService usersService;
	
	public List<Projects> projects = null;
	public List<String> users = new ArrayList<>();
	
	private Projects project;
	
	@PostConstruct
	public void init() {
		//EMPTY
	}
	
	public void addProjects() throws IOException {
		redirect(ADD_DESTINATION);
	}
	
    public String save() {
        this.projectsService.saveOrUpdate(getProject());
        FacesContext.getCurrentInstance().getExternalContext().
            getSessionMap().remove("project");
        return PROJECTS_TABLE;

    }
	
	public void redirect(final String destination) throws IOException {
		FacesContext.getCurrentInstance().getExternalContext().redirect(ADD_DESTINATION);
//		return destination;
	}
	
	public void setProjects(final List<Projects> projects) {
		this.projects = projects;
	}
	
	public List<Projects> getProjects() {
		if (!this.projectsService.getAll().isEmpty()) {
			this.projects.addAll(this.projectsService.getAll());
		} else {
			this.projects = new ArrayList<>();
		}

		return this.projects;
	}
	
	public void setProjectsService(final ProjectsService projectsService) {
		this.projectsService = projectsService;
	}

	public Projects getProject() {
		return project;
	}

	public void setProject(final Projects project) {
		this.project = project;
	}
	
	public List<String> getUsers() {
		if (!this.usersService.getAll().isEmpty()) {
			for (final Users user : this.usersService.getAll()) {
				this.users.add(user.getUserFirstName());
			}
		} else {
			this.users = new ArrayList<>();
		}
		return this.users;
	}
	
	public void setUsers(final List<String> users) {
		this.users = users;
	}

}
