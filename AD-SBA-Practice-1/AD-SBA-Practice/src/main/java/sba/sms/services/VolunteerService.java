package sba.sms.services;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import sba.sms.dao.VolunteerI;
import sba.sms.models.Activity;
import sba.sms.models.Volunteer;
import java.util.ArrayList;
import java.util.List;

public class VolunteerService implements VolunteerI {
    @Override
    public void createVolunteer(Volunteer v) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction t= session.beginTransaction();
        try (sessionFactory; session) {
            session.persist(v);
            // Commit the transaction
            t.commit();
        } catch (Exception e) {
            // Handle exceptions
            if (t != null && t.isActive()) {
                t.rollback();
            }
            // handle the exception accordingly
            e.printStackTrace();
        }
    }
    
    @Override
    public List<Volunteer> getAllVolunteers() {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t= session.beginTransaction();
        List<Volunteer> volunteers = new ArrayList<>();
        try {
            volunteers = session.createQuery("FROM Volunteer", Volunteer.class).list();
            t.commit();
        } catch (Exception e) {
            if (t != null && t.isActive())
                t.rollback();
            e.printStackTrace();
        } finally {
            session.close();
            factory.close();
        }
        return volunteers;
    }
    
    
    @Override
    public Volunteer getVolunteerByEmail(String email) {
        SessionFactory factory= new Configuration().configure().buildSessionFactory();
        Session session= factory.openSession();
        Transaction t= session.beginTransaction();
        Volunteer volunteerbyEmail = new Volunteer();
        try{
            volunteerbyEmail = session.createQuery("From Volunteer where email = :email", Volunteer.class)
                    .setParameter("email", email).uniqueResult();
            t.commit();
        }catch (Exception e){
            if (t != null && t.isActive())
                t.rollback();
            e.printStackTrace();
        } finally {
            session.close();
            factory.close();
        }
        return volunteerbyEmail;
    }
    @Override
    public boolean validateVolunteer(String email, String password) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session= sessionFactory.openSession();
        Transaction t= session.beginTransaction();
         try {
             Volunteer volunteer = new Volunteer();
             volunteer =session.createQuery("From Volunteer where email = :email and password = :password", Volunteer.class)
                     .setParameter("email", email).setParameter("password", password).uniqueResult();
             if(volunteer != null)
                 return true;
                t.commit();
         } catch (Exception e) {
             if (t != null && t.isActive())
                 t.rollback();
             e.printStackTrace();
         } finally {
             session.close();
             sessionFactory.close();
         }
        return false;
    }
    
    @Override
    public void registerVolunteerToActivity(String email, int ActivityId) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            // Retrieve the Volunteer by email
            Volunteer volunteer = session.createQuery("FROM Volunteer WHERE email = :email", Volunteer.class)
                    .setParameter("email", email).uniqueResult();
            // Retrieve the Activity by ID
            Activity activity = session.get(Activity.class, ActivityId);
            if (volunteer != null && activity != null) {
                // Register the Activity to the Volunteer (preventing duplication)
                if (!volunteer.getActivities().contains(activity))
                    volunteer.getActivities().add(activity);
                
            }
            // Commit the transaction
            transaction.commit();
        } catch (Exception e) {
            // Handle exceptions
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
    
    @Override
    public List<Activity> getVolunteerActivities(String email) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        List<Activity> activitiesList = new ArrayList<>();
        try {
            // Perform the database query to retrieve the Volunteer activities using a native query
            String nativeQuery = "SELECT a.* FROM Activity a " +
					"INNER JOIN volunteer_activities va ON a.id = va.activities_id " +
                    "INNER JOIN Volunteer v ON va.Fk_volunteer_email = v.email " +
                    "WHERE v.email = :email";
          activitiesList = session.createNativeQuery(nativeQuery, Activity.class)
                    .setParameter("email", email)
                    .list();
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
            sessionFactory.close();
        }
        return activitiesList;
    }
   
    
}
