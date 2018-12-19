package com.rn.model;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class StudentLogIn {
	
	@NotEmpty(message="Email will not be empty")
	@Email(message="Enter a Valid email")
	private String email;
	@NotEmpty(message="password will not be empty")
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
