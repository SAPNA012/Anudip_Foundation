
package model;

import javax.persistence.*;

@Entity
@Table(name = "library_records")
public class Library {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lid")
    private int lid; // Primary Key

    @Column(name = "book_name", length = 300, nullable = false)
    private String bookName;

    @Column(name = "book_id", length = 100, nullable = false)
    private int bookId;

    @Column(name = "book_author", length = 200, nullable = false)
    private String author;

    @ManyToOne
    @JoinColumn(name = "student_id") // Assuming this is the foreign key
    private Student student; // Assuming you have a Student class

    // Constructors, Getters, and Setters
    public Library() {}

    public Library(String bookName, int bookId, String author, Student student) {
        this.bookName = bookName;
        this.bookId = bookId;
        this.author = author;
        this.student = student;
    }

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Library{" +
                "lid=" + lid +
                ", bookName='" + bookName + '\'' +
                ", bookId=" + bookId +
                ", author='" + author + '\'' +
                ", student=" + (student != null ? student.getSId() : "None") + // Assuming Student has a getId() method
                '}';
    }
}
