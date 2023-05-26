package sba.sms.services;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import sba.sms.dao.ActivityI;
import sba.sms.models.Activity;

public class ActivityService implements ActivityI {

	@Override
	public void createActivity(Activity activity) {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();

		try {
			s.persist(activity);
			t.commit();

		} catch (Exception e) {
			if (t != null)
				t.rollback(); //
			e.printStackTrace();
		} finally {
			if (s != null)
				s.close();
			if (sf != null)
				sf.close();
		}
	}

	@Override
	public List<Activity> getAllActivities() {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		List<Activity> activitiesList = new ArrayList<>();

		try {
			activitiesList = s.createQuery("FROM Activity", Activity.class).list();
			t.commit();
			// Check for duplicates and add only unique activities to the list
	        for (Activity activity : activitiesList) {
	            if (!activitiesList.contains(activity))
	                activitiesList.add(activity);
	        }

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (s != null)
				s.close();
			if (sf != null)
				sf.close();
		}

		return activitiesList;
	}

	@Override
	public Activity getActivityById(int AcitivityId) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		Activity act = new Activity();
		try {
			// retrieve acitivity by its ID
			act = s.get(Activity.class, AcitivityId);

			t.commit();
		} catch (Exception e) {
			if (t != null) 
				t.rollback();			
			e.printStackTrace();
		} finally {
			// Close session and session factory
			if (s != null)
				s.close();
			
			if (sf != null)
				sf.close();
		}

		return act;
	}


}
