package com.teammanager.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.teammanager.model.Tasks;
import com.teammanager.service.TasksService;

@Scope("request")
@Component
public class TasksController implements Serializable {
	
	//private static final long serialVersionUID = 2614985191337857662L;

	
	@Autowired
	private TasksService tasksService;
	
	public List<Tasks> tasks = null;
	
	@PostConstruct
	public void init() {
		// Calling Business Service
		this.tasks.add((Tasks) this.tasksService.getAll());
	}
	
	public void setTasks(List<Tasks> tasks) {
		this.tasks = tasks;
	}
	
	public List<Tasks> getTasks() {
		return this.tasks;
	}
	
	public void setTasksService(TasksService tasksService) {
		this.tasksService = tasksService;
	}

}
