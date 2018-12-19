package com.rn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rn.model.Student;
import com.rn.repository.LogInDAO;
@Service("checkLogIn")
public class CheckLogInImpl implements CheckLogIn {
	@Autowired
	private LogInDAO logInDAO;
	
	public void setLogInDAO(LogInDAO logInDAO) {
		this.logInDAO = logInDAO;
	}
	@Override
	public boolean addStudent(Student student) {
		
		return logInDAO.registerStudent(student);
	}

	@Override
	public Student getStudent(String email, String password) {
		return logInDAO.fetchStudent(email,password);
	}

}
