package com.teammanager.service;

import java.util.List;

import javax.faces.context.FacesContext;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teammanager.dao.ProjectsDao;
import com.teammanager.model.Projects;

@Service
public class ProjectsServiceImpl implements ProjectsService {

	@Autowired
	private ProjectsDao projectsDao;
	
	@Override
	public List<Projects> getAll() {
		return this.projectsDao.getAll();
	}

	@Override
	public void saveOrUpdate(final Projects project) {
		this.projectsDao.saveOrUpdate(project);	
	}
	
	public void setProjectsDao(ProjectsDao projectsDao) {
		this.projectsDao = projectsDao;
	}

}
