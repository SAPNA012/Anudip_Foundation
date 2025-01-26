package daoImpl;

import dao.FaculityDao;

import model.Faculity;
import utility.hiberUtility;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;


public class FaculityDaoImpl  implements FaculityDao{

	    @Override
	    public void addFaculity(Faculity faculity) {
	        try (Session session = hiberUtility.getSessionFactory().openSession()) {
	            Transaction transaction = session.beginTransaction();
	            session.save(faculity);
	            transaction.commit();
	        }
	    }

	    @Override
	    public void updateFaculity(Faculity faculity) {
	        try (Session session = hiberUtility.getSessionFactory().openSession()) {
	            Transaction transaction = session.beginTransaction();
	            session.update(faculity);
	            transaction.commit();
	        }
	    }

	    @Override
	    public void deleteFaculity(int faculityId) {
	        try (Session session = hiberUtility.getSessionFactory().openSession()) {
	            Transaction transaction = session.beginTransaction();
	            Faculity faculity = session.get(Faculity.class, faculityId);
	            if (faculity != null) {
	                session.delete(faculity);
	            }
	            transaction.commit();
	        }
	    }

	    @Override
	    public Faculity getFaculityById(int faculityId) {
	        try (Session session = hiberUtility.getSessionFactory().openSession()) {
	            return session.get(Faculity.class, faculityId);
	        }
	    }

	    @Override
	    public List<Faculity> getAllFaculities() {
	        try (Session session = hiberUtility.getSessionFactory().openSession()) {
	            return session.createQuery("FROM Faculity", Faculity.class).list();
	        }
	    }
	}

	

