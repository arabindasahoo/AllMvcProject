package com.rn.service;

import com.rn.model.Student;

public interface CheckLogIn {
	public abstract boolean addStudent(Student student);
	public abstract Student getStudent(String email,String password);
}
