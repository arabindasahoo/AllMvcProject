package com.model;

public class User {

	private String name;
	private String email;
	private int age;
	private String country;
	public User(String name, String email, int age, String country) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public int getAge() {
		return age;
	}
	public String getCountry() {
		return country;
	}
	
	
}
