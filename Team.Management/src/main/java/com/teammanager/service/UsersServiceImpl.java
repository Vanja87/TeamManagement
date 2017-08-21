package com.teammanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teammanager.dao.UsersDao;
import com.teammanager.model.Users;

@Service
public class UsersServiceImpl implements UsersService {
	
	@Autowired
	private UsersDao usersDao;

	@Override
	public List<Users> getAll() {
		return this.usersDao.getAll();
	}
	
	public void setUsersDao(final UsersDao usersDao) {
		this.usersDao = usersDao;
	}

}
