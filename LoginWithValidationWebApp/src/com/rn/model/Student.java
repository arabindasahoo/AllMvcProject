package com.rn.model;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Student {

	private int studentId;
	@NotEmpty
	private String name;
	@NotEmpty
	@Email
	private String email;
	private Integer mobile;
	@NotEmpty
	private String password;
	@NotEmpty
	private String conformPassword;
	
	
	
	
	
	public String getConformPassword() {
		return conformPassword;
	}
	public void setConformPassword(String conformPassword) {
		this.conformPassword = conformPassword;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getMobile() {
		return mobile;
	}
	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}
	
	
	}
