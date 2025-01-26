package model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name = "StuAccount")
public class StuAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "StuAccountId")
    private int stuAccountId;
    @Column(name = "AccountHolder", nullable = false)
   private String AccUser_name;
    
    @Column(name = "AccountType", nullable = false)
    private String  accountType;

    @Column(name = "Student_fees", precision = 10, scale = 2)
    private Long studentFees;
    @OneToOne
    @JoinColumn(name = "student_id")  // Assuming 'student_id' is the foreign key
    private Student student;

    
    @Column(name = "SID")
    private Integer studentId;

   
    

    //@Enumerated(EnumType.STRING)
    @Column(name = "Pay_Type")
    private String payType;
    

  


	@Override
	public String toString() {
		return "StuAccount [stuAccountId=" + stuAccountId + ", AccUser_name=\" + AccUser_name + \", accountType=" + accountType + ", studentFees="
				+ studentFees + ", student=" + student + ", studentId=" + studentId + ", payType=" + payType + "]";
	}

	
	
	public StuAccount() {
		super();
		// TODO Auto-generated constructor stub
	}



	public StuAccount( String AccUser_name, String accountType, Long studentFees, Student student, Integer studentId, String payType) {
		super();
    	this.AccUser_name=AccUser_name;
		this.accountType = accountType;
		this.studentFees = studentFees;
		this.student = student;
		this.studentId = studentId;
		this.payType = payType;
	}



	public int getStuAccountId() {
		return stuAccountId;
	}

	public void setStuAccountId(int stuAccountId) {
		this.stuAccountId = stuAccountId;
	}

	
	public String getAccUser_name() {
		return AccUser_name;
	}



	public void setAccUser_name(String accUser_name) {
		AccUser_name = accUser_name;
	}



	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Long getStudentFees() {
		return studentFees;
	}

	public void setStudentFees(Long fees) {
		this.studentFees = fees;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}



	
    
}

