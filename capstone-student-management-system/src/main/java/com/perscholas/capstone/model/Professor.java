package com.perscholas.capstone.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@ToString
@Entity
@Table(name = "professors")
public class Professor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	private String firstName;
	private String lastName;
	private String email;
	private String address;
	//private String course;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "course_id")
	private Course course;
	
	public Professor(String firstName, String lastName, String email, String address, Course course) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.course = course;
	}
	
	public String check() {
		if(this.course == null)
			return "No Course";
		else
			return course.getId().toString();
	}
}
