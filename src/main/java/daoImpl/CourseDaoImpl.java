package daoImpl;

import dao.CourseDao;

import model.Course;
import utility.hiberUtility;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CourseDaoImpl implements CourseDao{




    public void addCourse(Course course) {
        try (Session session = hiberUtility.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(course);
            transaction.commit();
        }
    }

    @Override
    public void updateCourse(Course course) {
        try (Session session = hiberUtility.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.update(course);
            transaction.commit();
        }
    }

    @Override
    public void deleteCourse(int courseId) {
        try (Session session = hiberUtility.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Course course = session.get(Course.class, courseId);
            if (course != null) {
                session.delete(course);
            }
            transaction.commit();
        }
    }

    @Override
    public Course getCourseById(int courseId) {
        try (Session session = hiberUtility.getSessionFactory().openSession()) {
            return session.get(Course.class, courseId);
        }
    }

    @Override
    public List<Course> getAllCourses() {
        try (Session session = hiberUtility.getSessionFactory().openSession()) {
            return session.createQuery("FROM Course", Course.class).list();
        }
    }
}



