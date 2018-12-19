package com.rn.repository;

import com.rn.model.Student;

public interface LogInDAO {
	public abstract boolean registerStudent(Student student);
	public abstract Student fetchStudent(String email,String password);
}

