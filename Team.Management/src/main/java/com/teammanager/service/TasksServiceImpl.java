package com.teammanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.teammanager.dao.TasksDao;
import com.teammanager.model.Tasks;

public class TasksServiceImpl implements TasksService {
	
	@Autowired
	private TasksDao tasksDao;

	@Override
	public List<Tasks> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void setTasksDao(TasksDao tasksDao) {
		this.tasksDao = tasksDao;

}
}
