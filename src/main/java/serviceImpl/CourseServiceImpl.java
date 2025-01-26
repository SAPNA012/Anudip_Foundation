package serviceImpl;



import java.util.List;

import dao.CourseDao;
import daoImpl.CourseDaoImpl;
import model.Course;
import service.courseService;

public class CourseServiceImpl implements courseService {
    private final CourseDao courseDao = new CourseDaoImpl();

    @Override
    public void addCourse(Course course) {
        courseDao.addCourse(course);
    }

    @Override
    public void updateCourse(Course course) {
        courseDao.updateCourse(course);
    }

    @Override
    public void deleteCourse(int courseId) {
        courseDao.deleteCourse(courseId);
    }

    @Override
    public Course getCourseById(int courseId) {
        return courseDao.getCourseById(courseId);
    }

    @Override
    public List<Course> getAllCourses() {
        return courseDao.getAllCourses();
    }
}
