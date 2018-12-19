package com.dao;

import java.util.List;

import com.model.User;

public interface UserDao {

	abstract List<User> getAllUser();
	abstract void createUser(User user);
}
