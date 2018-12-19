package com.service;

import java.util.List;

import com.model.User;

public interface UserServiceDao {

	abstract List<User> fetchAllUser();
	abstract void addUser(User user);
}

