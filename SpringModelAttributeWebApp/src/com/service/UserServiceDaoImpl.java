package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.model.User;
@Service
public class UserServiceDaoImpl implements UserServiceDao {

	@Autowired
	UserDao userDao;
	@Override
	public List<User> fetchAllUser() {
		
		return userDao.getAllUser();
	}

	@Override
	public void addUser(User user) {
		
		userDao.createUser(user);
	}

}
