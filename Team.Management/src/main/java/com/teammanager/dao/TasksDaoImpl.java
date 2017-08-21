package com.teammanager.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.teammanager.model.Tasks;

public class TasksDaoImpl implements TasksDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Tasks> getAll() {
		 @SuppressWarnings("unchecked")
	        List<Tasks> listUser = (List<Tasks>) sessionFactory.getCurrentSession()
	                .createCriteria(Tasks.class)
	                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	 
	        return listUser;
		
	}
	
	public void setSessionFactory(final SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
