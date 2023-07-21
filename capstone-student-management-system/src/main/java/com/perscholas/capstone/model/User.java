package com.perscholas.capstone.model;

import java.beans.JavaBean;

import jakarta.persistence.*;
import lombok.*;

@JavaBean
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	private String firstName;
	private String lastName;
	
	@Column(unique=true)
	private String email;
	
	private String password;
	private String address;
	private String address_2;
	private String city;
	private String state;
	private String zipcode;
	
	public User(String firstName, String lastName, String email, String password, String address, String address_2,
			String city, String state, String zipcode) {

		this.firstName= firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.address = address;
		this.address_2 = address_2;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}

	
}
