package model;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table

public class Student {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="student_ID" ,length=50)
	    private int SId;
	    @Column(length=50)
	    private int Age;
	    
	    @Column(length=12)
	    private long  mobile_num;
	    @Column(length=255)
	    private String student_Name;
	    
	         @Column(name="class", length=255)
             private String Stu_Class;
	         @Column(length=155)
             private String    Branch ;
	         @Column(length=255)
             private String Address;            
	       
	         @OneToOne(mappedBy = "student")
	         private StuAccount stuAccount;
	         @Cascade(CascadeType.ALL)
	         @OneToMany(mappedBy = "student", fetch = FetchType.EAGER)
	         private List<Enrollments> enrollments;
	        
	         @Override
	         public String toString() {
	             return String.format(
	                 "Students Details:\n- StudentID: %d\n-  Student_Age: %d\n-  Student_mobile: %d\n- Student_Name: %s\n- "
	                 + "student_class: %s\n- Student_branch: %s\n- Address:",
	                 SId,Age, mobile_num,student_Name,Stu_Class,  Branch,Address
	               
	             );
}
}