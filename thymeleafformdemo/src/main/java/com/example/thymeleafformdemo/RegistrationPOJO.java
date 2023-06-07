package com.example.thymeleafformdemo;

import java.io.Serializable;

public class RegistrationPOJO implements Serializable{
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String city;
	private String state;
	private String zipcode;
	
	public RegistrationPOJO() {
		
	};
	
	public RegistrationPOJO(String firstName, String lastName, String username, String password, String city, String state, String zipcode) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
}
