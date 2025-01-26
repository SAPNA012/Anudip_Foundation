package dao;
import model.Course;
import java.util.List;



public interface CourseDao {
	 void addCourse(Course course);
	    void updateCourse(Course course);
	    void deleteCourse(int courseId);
	    Course getCourseById(int courseId);
	    
	    List<Course> getAllCourses();
	    
	    
	   
	}



