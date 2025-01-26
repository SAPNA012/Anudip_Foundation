package daoImpl;

import dao.StudentDao;
import model.Student;
import utility.hiberUtility;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.List;

public class StudentDaoImpl implements  StudentDao{
	@Override
	    public void addStudent(Student student) {
	        try (Session session = hiberUtility.getSessionFactory().openSession()) {
	            Transaction transaction = session.beginTransaction();
	            session.save(student);
	            transaction.commit();
	        }
	    }

	    @Override
	    public void updateStudent(Student student) {
	        try (Session session = hiberUtility.getSessionFactory().openSession()) {
	            Transaction transaction = session.beginTransaction();
	            session.update(student);
	            transaction.commit();
	        }
	    }

	    @Override
	    public void deleteStudent(int studentId) {
	        try (Session session = hiberUtility.getSessionFactory().openSession()) {
	            Transaction transaction = session.beginTransaction();
	            Student student = session.get(Student.class, studentId);
	            if (student != null) {
	                session.delete(student);
	            }
	            transaction.commit();
	        }
	    }

	    @Override
	    public Student getStudentById(int studentId) {
	        try (Session session = hiberUtility.getSessionFactory().openSession()) {
	            return session.get(Student.class, studentId);
	        }
	    }

	    @Override
	    public List<Student> getAllStudents() {
	        try (Session session = hiberUtility.getSessionFactory().openSession()) {
	            return session.createQuery("FROM Student", Student.class).list();
	        }
	    }
	}

	
	
	
	
	
	


