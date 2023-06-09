package com.perscholas.Hib_Manytoone;

import static org.junit.jupiter.api.Assertions.assertEquals;

//import static org.junit.Assert.assertEquals;

//import static org.junit.Assert.assertEquals;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;

import com.perscholas.model.Address;
import com.perscholas.model.Person;



/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
	@Test
	public void testPersonLookUp() {
		
	   	//SessionFactory factory = new Configuration().configure().buildSessionFactory();
	   	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session session = factory.openSession();
    	
    	Transaction t = session.beginTransaction();   
    	
		//======================== 
    	// GOAL:   Test that a Person Object exists in the database
    	// with name="Bill Board"   	
    	//=========================
    	
		String myquery="SELECT * FROM Person WHERE name ='Bill Board' ";
	    List<Object[]> details = session.createNativeQuery(myquery).list();
	         for (Object[] objects : details) {
	            Integer person_id=(Integer)objects[0];
	            Integer age=(Integer)objects[1];
	            String email=(String)objects[2];
	            String name=(String)objects[3];
	            Person testPerson = new Person();
	     
	            
	            testPerson.setName("Bill Board");
	            assertEquals(name, testPerson.getName());
	            System.out.println("person_id="+person_id+" age="+age+" email="+email+" name= "+name);
	         }	
	    
		session.close();
		System.out.println("Session Closed");
	}
	
	@Test
	public void testAddressLookUp() {
		//======================== 
    	// GOAL:   Test that a Address Object exists in the database
    	// with city="nyc"   	
    	//=========================
		
	   	//SessionFactory factory = new Configuration().configure().buildSessionFactory();
	   	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session session = factory.openSession();
    	
    	Transaction t = session.beginTransaction();   
    		
		String myquery="SELECT * FROM address WHERE city ='nyc' ";
	    List<Object[]> details = session.createNativeQuery(myquery).list();
	         for (Object[] objects : details) {
	            Integer address_id=(Integer)objects[0];
	            String city=(String)objects[1];
	            String state=(String)objects[2];
	            String street=(String)objects[3];
	            Integer zipcode = (Integer)objects[4];
	            Address testAddress = new Address();
	     
	             
	            testAddress.setCity("nyc");
	            assertEquals(city, testAddress.getCity());
	            System.out.println("Address_id = " + address_id + " city = " + city +" state = " + state + " street = " + street + " zip code = " + zipcode);
	         }	
	}
}
