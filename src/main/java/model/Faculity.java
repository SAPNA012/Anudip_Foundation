package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "faculty") 
public class Faculity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "faculty_id")  
    private int facultyId;

    @Column(name = "faculty_name")
    private String facultyName;

    @Column(name = "faculty_department")
    private String facultyDepartment;
   
    
   

    @Override
    public String toString() {
        return String.format(
            "Faculty Details:\n- ID: %d\n- Name: %s\n- Department: %s",
            facultyId,
            facultyName,
            facultyDepartment != null ? facultyDepartment : "Not Assigned"
        );
    }
    
}
