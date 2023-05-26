package com.test.hib.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.test.hib.model.User;

public class FindingUser {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		
		int USER_ID = 2;
		User user = session.load(User.class, USER_ID);
		System.out.println("Fullname: " + user.getFullname());
		System.out.println("Email: " + user.getEmail());
		System.out.println("Password: " + user.getPassword());
		
		//Close resources
		t.commit();
		factory.close();
		session.close();
	}
}
