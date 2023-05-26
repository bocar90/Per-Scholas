package com.test.hib.controller;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.test.hib.model.User;

public class FindUser_Hql {
	public void findUser() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		// Example of HQL to get all records of user class
		String hql = "FROM User";
		TypedQuery query = session.createQuery(hql);
		List<User> results = query.getResultList();
		for(User u: results) {
			System.out.println("User Id: " + u.getId() + "|" + " Full name:" + u.getFullname() + "|" + "Email: " + u.getEmail() + "|" + "Password: " + u.getPassword());
		}
	}
	
	public void findUSerSelect() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		/* ------------  Example of HQL to get all the records------- */
		String hql = "SELECT u FROM User u";
		Query query =session.createQuery(hql);
		List<User> list = query.getResultList();
		
		for(User u: list) {
			System.out.println("User Id: " +u.getId() + "|" + " Full name:" + u.getFullname() +"|"+ "Email: " + u.getEmail() +"|"+ "Password: " + u.getPassword());
		}
	}
	
	public void getRecordbyId() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		String hql = "FROM User E WHERE E.id > 2 ORDER BY E.salary DESC";
		TypedQuery query = session.createQuery(hql);
		List<User> result = query.getResultList();
		for(User u: result) {
			System.out.println("User Id: " +u.getId() + "|" + " Full name:" + u.getFullname() +"|"+ "Email: " + u.getEmail() +"|"+ "Password: " + u.getPassword());
		}
	}
	
	public void getRecords() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		TypedQuery<Object[]> query = session.createQuery("SELECT U.salary, U.fullname FROM User AS U", Object[].class);
		List<Object[]> results = query.getResultList();
		for(Object[] a : results) {
			System.out.println("Salary: " + a[0] + ", City: " + a[1]);
		}
	}
	
	public void getMaxSalary() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		String hql = "SELECT max(U.salary) FROM User U";
		TypedQuery query = session.createQuery(hql);
		double result = (double) query.getSingleResult();
		System.out.println(result);
	}
	
	public void getMaxSalaryGroupBy() {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		String hql = "SELECT SUM(U.salary), U.city FROM User U GROUP BY U.city";
		TypedQuery query = session.createQuery(hql);
		List<Object[]> result = query.getResultList();
		for(Object[] o: result) {
			System.out.println("Total Salary " + o[0] + " | city: "+ o[1]);
		}		
	}
	
	public void NamedQueryExample() {
	   	 SessionFactory factory = new Configuration().configure().buildSessionFactory();
	   	 Session session = factory.openSession();
	   	 String hql = "FROM User u WHERE u.id = :id";
	   	 TypedQuery query = session.createQuery(hql);
	   	 query.setParameter("id",2);
	   	 List<User> result = query.getResultList();
	   	 for (User u : result) {
		   	 System.out.println("User Id: " +u.getId() + "|" + " Full name:" + u.getFullname() +"|"+ "Email: " + u.getEmail() +"|"+ "password" + u.getPassword());
		    }
	}
	
}
