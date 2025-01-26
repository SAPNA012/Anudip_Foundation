package model;




import javax.persistence.*;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "faculty_account")
public class FaculityAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private int accountId;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "password", length = 10, nullable = false)
    private String password;

    

    @OneToOne
    @Cascade(CascadeType.ALL)
    @JoinColumn(name = "faculty_id")
    private Faculity faculty;

    @Override
    public String toString() {
        return String.format(
            "Faculty Account Details:\n- Account ID: %d\n- Username: %s\n- Faculty ID: %s",
            accountId, username, faculty != null ? faculty.getFacultyId() : "N/A" // Assuming getFacultyId() exists
        );
    }
}
