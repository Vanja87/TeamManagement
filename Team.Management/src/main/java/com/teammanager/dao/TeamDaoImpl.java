package com.teammanager.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.teammanager.model.Team;

public class TeamDaoImpl implements TeamDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Team> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void setSessionFactory(final SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
