package com.teammanager.service;

import java.util.List;

import com.teammanager.model.Projects;

public interface ProjectsService {
	
	public List<Projects> getAll();
	
	public void saveOrUpdate(final Projects project);
	
}
