package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.User;
@Repository
public class UserDaoImpl implements UserDao {

	List<User> userList=new ArrayList<User>();
	@Override
	public List<User> getAllUser() {
		
		userList.add(new User("arabinda","arabinda21@gmail.com",30,"India"));
		userList.add(new User("kunu","kunu21@gmail.com",30,"India"));
		userList.add(new User("debadatta","debadatta21@gmail.com",30,"USA"));
		userList.add(new User("Deepak","Deeepal21@gmail.com",30,"others"));

		return userList;
	}

	@Override
	public void createUser(User user) {
		
		userList.add(user);
		
	}

}
