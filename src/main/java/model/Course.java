package model;



import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import lombok.Data;
@Data
@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private int courseId;

    @Column(name = "course_name")
    private String courseName;

    @ManyToOne
    @JoinColumn(name = "faculty_id")
    private Faculity faculity;  
    @OneToMany(fetch = FetchType.EAGER)
    @Cascade(CascadeType.ALL)
    private List<Course> courses;
    
	public List<Course> getCourses() {
		return courses;
	}
	
	public void setCourseName(String name) {
		this.courseName=name;
		
	}
	
    @Override
    public String toString() {
        return String.format(
            "Course  Details:\n- Course ID: %d\n-   Course_Name: %s\n- "
            + "faculty_ID: %s", courseId,courseName,faculity
        );
}
   
}

