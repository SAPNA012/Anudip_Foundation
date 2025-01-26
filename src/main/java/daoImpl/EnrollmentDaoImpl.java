package daoImpl;

import java.util.List;
import dao.EnrollmentDao;
import model.Enrollments;
import utility.hiberUtility;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class EnrollmentDaoImpl implements EnrollmentDao {
	
	    @Override
	    public void addEnrollment(Enrollments enrollment) {
	        try (Session session = hiberUtility.getSessionFactory().openSession()) {
	            Transaction transaction = session.beginTransaction();
	            session.save(enrollment);
	            transaction.commit();
	        }
	    }

	    @Override
	    public void updateEnrollment(Enrollments enrollment) {
	        try (Session session = hiberUtility.getSessionFactory().openSession()) {
	            Transaction transaction = session.beginTransaction();
	            session.update(enrollment);
	            transaction.commit();
	        }
	    }

	    @Override
	    public void deleteEnrollment(int enrollmentId) {
	        try (Session session = hiberUtility.getSessionFactory().openSession()) {
	            Transaction transaction = session.beginTransaction();
	            Enrollments enrollment = session.get(Enrollments.class, enrollmentId);
	            if (enrollment != null) {
	                session.delete(enrollment);
	            }
	            transaction.commit();
	        }
	    }

	    @Override
	    public Enrollments getEnrollmentById(int enrollmentId) {
	        try (Session session = hiberUtility.getSessionFactory().openSession()) {
	            return session.get(Enrollments.class, enrollmentId);
	        }
	    }

	    @Override
	    public List<Enrollments> getAllEnrollments() {
	        try (Session session = hiberUtility.getSessionFactory().openSession()) {
	            return session.createQuery("FROM Enrollments", Enrollments.class).list();
	        }
	    }
	}


	

