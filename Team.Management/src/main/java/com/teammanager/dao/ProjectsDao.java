package com.teammanager.dao;

import java.util.List;

import com.teammanager.model.Projects;

public interface ProjectsDao {
	
	public List<Projects> getAll();
	
	public void saveOrUpdate(Projects project);

}
