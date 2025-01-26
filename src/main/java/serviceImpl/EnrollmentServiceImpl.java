package serviceImpl;



import java.util.List;

import dao.EnrollmentDao;
import daoImpl.EnrollmentDaoImpl;
import model.Enrollments;
import service.EnrollmentService;

public class EnrollmentServiceImpl implements EnrollmentService {
    private final EnrollmentDao enrollmentDao = new EnrollmentDaoImpl();

    @Override
    public void addEnrollment(Enrollments enrollment) {
        enrollmentDao.addEnrollment(enrollment);
    }

    @Override
    public void updateEnrollment(Enrollments enrollment) {
        enrollmentDao.updateEnrollment(enrollment);
    }

    @Override
    public void deleteEnrollment(int enrollmentId) {
        enrollmentDao.deleteEnrollment(enrollmentId);
    }

    @Override
    public Enrollments getEnrollmentById(int enrollmentId) {
        return enrollmentDao.getEnrollmentById(enrollmentId);
    }

    @Override
    public List<Enrollments> getAllEnrollments() {
        return enrollmentDao.getAllEnrollments();
    }
}
