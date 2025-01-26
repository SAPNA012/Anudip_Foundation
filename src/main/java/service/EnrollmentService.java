package service;


import model.Enrollments;
import java.util.List;

public interface EnrollmentService {
    void addEnrollment(Enrollments enrollment);
    void updateEnrollment(Enrollments enrollment);
    void deleteEnrollment(int enrollmentId);
    Enrollments getEnrollmentById(int enrollmentId);
    List<Enrollments> getAllEnrollments();
}
