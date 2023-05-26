package com.test.hib.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.test.hib.model.User;

public class CreateUser {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		User uOne = new User();
		uOne.setEmail("haseeb@gmail.com");
		uOne.setFullname("Moh Haseeb");
		uOne.setPassword("has123");
		uOne.setSalary(2000.69);
		uOne.setAge(20);
		uOne.setCity("NYC");
		
		User uTwo = new User();
		uTwo.setEmail("James@gmail.com");
		uTwo.setFullname("James Santana");
		uTwo.setPassword("James123");
		uTwo.setSalary(2000.69);
		uTwo.setAge(25);
		uTwo.setCity("Dallas");
		
		User uThree = new User();
    	uThree.setEmail("Shahparan@gmail.com");
    	uThree.setFullname("AH Shahparan");
    	uThree.setPassword("Shahparan123");
    	uThree.setSalary(3060.69);
    	uThree.setAge(30);
    	uThree.setCity("Chicago");
    	
    	/*========= We can pass value/data by using constructor =========*/
    	User uFour = new User("Christ", "christ@gmail.com",  "147852", 35, 35000.3,"NJ");
    	User uFive = new User("Sid", "Sid", "s258", 29, 4000.36, "LA");
    	//Integer userid = null
    	session.persist(uOne);
    	session.persist(uTwo);
    	session.persist(uThree);
    	session.persist(uFour);
    	session.persist(uFive);
    	
    	t.commit();
    	System.out.println("Successfully saved");
    	factory.close();
    	session.close();
    	
	}
}
