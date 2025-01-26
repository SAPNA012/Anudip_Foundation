package Demo.SmartEduHub;

import java.util.List;
import java.util.Scanner;

import model.Course;
import model.Faculity;
import model.FaculityAccount;
import model.Library;
import model.StuAccount;
import model.Student;
import service.FacultyAccountService;
import service.FacultyService;
import service.LibraryService;
import service.StuAccountService;
import service.StudentService;
import service.courseService;
import serviceImpl.CourseServiceImpl;
import serviceImpl.FacultyAccountServiceImpl;
import serviceImpl.FacultyServiceImpl;
import serviceImpl.LibraryServiceImpl;
import serviceImpl.StuAccountServiceImpl;
import serviceImpl.StudentServiceImpl;

public class SubMenu {
    private final Scanner scanner = new Scanner(System.in);
    private final StudentService studentService = new StudentServiceImpl();
    private final FacultyService facultyService = new FacultyServiceImpl();
    private final LibraryService libraryService = new LibraryServiceImpl();
    private final StuAccountService stuAccountService = new StuAccountServiceImpl();
    private final courseService courseService = new CourseServiceImpl();
    private final FacultyAccountService facultyAccountService = new FacultyAccountServiceImpl();

    public void manageStudents() {
        while (true) {
            System.out.println("\n=== Manage Students ===");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. View Student by ID");
            System.out.println("5. View All Students");
            System.out.println("6. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    updateStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    viewStudentById();
                    break;
                case 5:
                    viewAllStudents();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addStudent() {
        System.out.println("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Student Age: ");
        int age = scanner.nextInt();
       System.out.println("Enter Student mobile number: ");
        long mobile = scanner.nextLong();
        scanner.nextLine();
        System.out.println("Enter Student class: ");
        String class1 = scanner.nextLine();
        System.out.println("Enter Student branch: ");
        String branch = scanner.nextLine();
        System.out.println("Enter Student Address: ");
        String Address = scanner.nextLine();
        
        Student student = new Student();
        student.setStudent_Name(name);
        student.setAge(age);
         student.setMobile_num(mobile);
         student.setStu_Class(class1);
         student.setBranch(branch);
         student.setAddress(Address);
         
        studentService.addStudent(student);
        System.out.println("Student added successfully!");
    }

    private void updateStudent() {
        System.out.println("Enter Student ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        

        Student student = studentService.getStudentById(id);
        if (student != null) {
            System.out.println("Enter New Name: ");
            String name = scanner.nextLine();
            System.out.println("Enter New Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter Student new mobile number: ");
            int mobile = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter Student new class: ");
            String class1 = scanner.nextLine();
            System.out.println("Enter Student new branch: ");
            String branch = scanner.nextLine();
            System.out.println("Enter Student  new Address: ");
            String Address = scanner.nextLine();
            
            
            
            
            
            student.setStudent_Name(name);
            student.setAge(age);
            student.setMobile_num(mobile);
            student.setStu_Class(class1);
            student.setBranch(branch);
            student.setAddress(Address);
            

            studentService.updateStudent(student);

            System.out.println("Student updated successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }

    private void deleteStudent() {
        System.out.println("Enter Student ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        studentService.deleteStudent(id);
        System.out.println("Student deleted successfully!");
    }

    private void viewStudentById() {
        System.out.println("Enter Student ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Student student = studentService.getStudentById(id);
        if (student != null) {
            System.out.println("Student Details: " + student);
        } else {
            System.out.println("Student not found.");
        }
    }

    private void viewAllStudents() {
        System.out.println("All Students:");
        List<Student> students = studentService.getAllStudents();
        for (Student student : students) {
            System.out.println(student);
        }
    }
    public void manageFaculty() {
        while (true) {
            System.out.println("\n=== Manage Faculty ===");
            System.out.println("1. Add Faculty");
            System.out.println("2. Update Faculty");
            System.out.println("3. Delete Faculty");
            System.out.println("4. View Faculty by ID");
            System.out.println("5. View All Faculty");
            System.out.println("6. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addFaculty();
                    break;
                case 2:
                    updateFaculty();
                    break;
                case 3:
                    deleteFaculty();
                    break;
                case 4:
                    viewFacultyById();
                    break;
                case 5:
                    viewAllFaculty();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addFaculty() {
        System.out.println("Enter Faculty Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Faculty Department: ");
        String department = scanner.nextLine();

        Faculity faculty = new Faculity();
        faculty.setFacultyName(name);
        faculty.setFacultyDepartment(department);

        facultyService.addFaculity(faculty);
        System.out.println("Faculty added successfully!");
    }

    private void updateFaculty() {
        System.out.println("Enter Faculty ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Faculity faculty = facultyService.getFaculityById(id);
        if (faculty != null) {
            System.out.println("Enter New Name: ");
            String name = scanner.nextLine();
            System.out.println("Enter New Department: ");
            String department = scanner.nextLine();

            faculty.setFacultyName(name);
            faculty.setFacultyDepartment(department);

            facultyService.updateFaculity(faculty);

            System.out.println("Faculty updated successfully!");
        } else {
            System.out.println("Faculty not found.");
        }
    }

    private void deleteFaculty() {
        System.out.println("Enter Faculty ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        facultyService.deleteFaculity(id);
        System.out.println("Faculty deleted successfully!");
    }

    private void viewFacultyById() {
        System.out.println("Enter Faculty ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Faculity faculty = facultyService.getFaculityById(id);
        if (faculty != null) {
            System.out.println("Faculty Details: " + faculty);
        } else {
            System.out.println("Faculty not found.");
        }
    }

    private void viewAllFaculty() {
        System.out.println("All Faculty:");
        List<Faculity> facultyList = facultyService.getAllFaculities();
        for (Faculity faculty : facultyList) {
            System.out.println(faculty);
        }
    }
    
    public void manageLibrary() {
        while (true) {
            System.out.println("\n=== Manage Library ===");
            System.out.println("1. Add Book");
            System.out.println("2. Update Book");
            System.out.println("3. Delete Book");
            System.out.println("4. View Book by ID");
            System.out.println("5. View All Books");
            System.out.println("6. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    updateBook();
                    break;
                case 3:
                    deleteBook();
                    break;
                case 4:
                    viewBookById();
                    break;
                case 5:
                    viewAllBooks();
                    break;
                case 6:
                    return; // Exit the library management menu
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addBook() {
        System.out.println("Enter Book ID: ");
        int bookID = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.println("Enter Book Title: ");
        String title = scanner.nextLine();
        System.out.println("Enter Book Author: ");
        String author = scanner.nextLine();
        System.out.println("Enter Student ID:");
        int studentId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Retrieve the Student object based on the student ID
        Student student = studentService.getStudentById(studentId); // Assuming this method exists

        if (student == null) {
            System.out.println("Student with ID " + studentId + " does not exist. Please try again.");
            return; // Exit the method if the student does not exist
        }

        // Create the Library object
        Library book = new Library();
        book.setBookName(title);
        book.setAuthor(author);
        book.setStudent(student); // Set the retrieved Student object
        book.setBookId(bookID);

        // Save the book
        libraryService.addLibraryItem(book);
        System.out.println("Book added successfully!");
    }

    private void updateBook() {
        System.out.println("Enter Book ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Library book = libraryService.getLibraryItemById(id);
        if (book != null) {
            System.out.println("Enter New Title: ");
            String title = scanner.nextLine();
            System.out.println("Enter New Author: ");
            String author = scanner.nextLine();
            System.out.println("Enter New Student ID (or press Enter to keep current): ");
            String studentIdInput = scanner.nextLine();

            book.setBookName(title);
            book.setAuthor(author);

            // Update the student if a new ID is provided
            if (!studentIdInput.isEmpty()) {
                int studentId = Integer.parseInt(studentIdInput);
                Student student = studentService.getStudentById(studentId);
                if (student != null) {
                    book.setStudent(student);
                } else {
                    System.out.println("Student with ID " + studentId + " does not exist. Keeping current student.");
                }
            }

            libraryService.updateLibraryItem(book);
            System.out.println("Book updated successfully!");
        } else {
            System.out.println("Book not found.");
        }
    }

    private void deleteBook() {
        System.out.println("Enter Book ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        libraryService.deleteLibraryItem(id);
        System.out.println("Book deleted successfully!");
    }

    private void viewBookById() {
        System.out.println("Enter Book ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Library book = libraryService.getLibraryItemById(id);
        if (book != null) {
            System.out.println("Book Details: " + book);
        } else {
            System.out.println("Book not found.");
        }
    }

    private void viewAllBooks() {
        System.out.println("All Books:");
        List<Library> books = libraryService.getAllLibraryItems();
        for (Library book : books) {
            System.out.println(book);
        }
    }

    public void manageStudentAccounts() {
        while (true) {
            System.out.println("\n=== Manage Student Accounts ===");
            System.out.println("1. Add  student Account");
            System.out.println("2. Update student Account");
            System.out.println("3. Delete student Account");
            System.out.println("4. View student Account by ID");
            System.out.println("5. View All student Accounts");
            System.out.println("6. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                	addstuAccount();
                    break;
                case 2:
                    updatestuAccount();
                    break;
                case 3:
                    deletestuAccount();
                    break;
                case 4:
                    viewstuAccountById();
                    break;
                case 5:
                    viewAllstuAccounts();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    
    private void addstuAccount() {
        System.out.println("Enter Account Holder Name: ");
        String name = scanner.nextLine();
        
        System.out.println("Choose Account type listed below: ");
        System.out.println("Student_fees, Bus_fees, Exam_fees, Registration_fees");
        String type = scanner.nextLine();
        
        System.out.println("Enter Account fees: ");
        Long fees = scanner.nextLong();
        scanner.nextLine(); 

        System.out.println("Enter payment type:\n 1. cash \n 2. online ");
        String ptype = scanner.nextLine();

        System.out.println("Enter student ID:");
        Integer studentId = scanner.nextInt();
        scanner.nextLine(); 

       
        Student student = studentService.getStudentById(studentId); // Assuming you have a method to get a student by ID

        if (student == null) {
            System.out.println("Student with ID " + studentId + " does not exist. Please try again.");
            return; 
        }

       
        StuAccount account = new StuAccount();
        account.setAccountType(type);
        account.setAccUser_name(name);
        account.setPayType(ptype);
        account.setStudentFees(fees);
        account.setStudent(student); 

        
        stuAccountService.addStuAccount(account);
        System.out.println("Account added successfully!");
    }
    


    private void updatestuAccount() {
        System.out.println("Enter Account ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        StuAccount account = stuAccountService.getStudentAccountById(id);
        if (account != null) {
            System.out.println("Enter New Account Name: ");
            String name = scanner.nextLine();

            account.setAccountType(name);

            stuAccountService.updateStudentAccount(account);

            System.out.println("Account updated successfully!");
        } else {
            System.out.println("Account not found.");
        }
    }

    private void deletestuAccount() {
        System.out.println("Enter Account ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        stuAccountService.deleteStudentAccount(id);
        System.out.println("Account deleted successfully!");
    }

    private void viewstuAccountById() {
        System.out.println("Enter Account ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        StuAccount account = stuAccountService.getStudentAccountById(id);
        if (account != null) {
            System.out.println("Account Details: " + account);
        } else {
            System.out.println("Account not found.");
        }
    }

    private void viewAllstuAccounts() {
        System.out.println("All Accounts:");
        List<StuAccount> accounts = stuAccountService.getAllStudentAccounts();
        for (StuAccount account : accounts) {
            System.out.println(account);
        }
    }
    public void manageCourses() {
        while (true) {
            System.out.println("\n=== Manage Courses ===");
            System.out.println("1. Add Course");
            System.out.println("2. Update Course");
            System.out.println("3. Delete Course");
            System.out.println("4. View Course by ID");
            System.out.println("5. View All Courses");
            System.out.println("6. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addCourse();
                    break;
                case 2:
                    updateCourse();
                    break;
                case 3:
                    deleteCourse();
                    break;
                case 4:
                    viewCourseById();
                    break;
                case 5:
                    viewAllCourses();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    
    private void addCourse() {
        System.out.println("Enter Course Name: ");
        String name = scanner.nextLine();

        System.out.println("Enter Faculty ID: ");
        int facultyId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Retrieve the Faculty object based on the faculty ID
        Faculity faculty = facultyService.getFaculityById(facultyId); // Assuming you have a method to get a faculty by ID

        if (faculty == null) {
            System.out.println("Faculty with ID " + facultyId + " does not exist. Please try again.");
            return; // Exit the method if the faculty does not exist
        }

        // Create the Course object and set the faculty
        Course course = new Course();
        course.setCourseName(name);
        course.setFaculity(faculty); // Set the retrieved Faculty object

        // Save the course
        courseService.addCourse(course);
        System.out.println("Course added successfully!");
    }
    
    
  
    private void updateCourse() {
        System.out.println("Enter Course ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Course course = courseService.getCourseById(id);
        if (course != null) {
            System.out.println("Enter New Course Name: ");
            String name = scanner.nextLine();


            course.setCourseName(name);
           

            courseService.updateCourse(course);

            System.out.println("Course updated successfully!");
        } else {
            System.out.println("Course not found.");
        }
    }

    private void deleteCourse() {
        System.out.println("Enter Course ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        courseService.deleteCourse(id);
        System.out.println("Course deleted successfully!");
    }

    private void viewCourseById() {
        System.out.println("Enter Course ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Course course = courseService.getCourseById(id);
        if (course != null) {
            System.out.println("Course Details: " + course);
        } else {
            System.out.println("Course not found.");
        }
    }

    private void viewAllCourses() {
        System.out.println("All Courses:");
        List<Course> courses = courseService.getAllCourses();
        for (Course course : courses) {
            System.out.println(course);
        }
    }
    public void manageFacultyAccounts() {
        while (true) {
            System.out.println("\n=== Manage Faculty Accounts ===");
            System.out.println("1. Add Account");
            System.out.println("2. Update Account");
            System.out.println("3. Delete Account");
            System.out.println("4. View Account by ID");
            System.out.println("5. View All Accounts");
            System.out.println("6. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                	addFaculityAccount();
                    break;
                case 2:
                    updateFaculityAccount();
                    break;
                case 3:
                    deleteFaculityAccount();
                    break;
                case 4:
                    viewFaculityAccountById();
                    break;
                case 5:
                    viewAllFaculityAccounts();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    
    
    private void addFaculityAccount() {
        System.out.println("Enter UserName: ");
        String name = scanner.nextLine();
        
        System.out.println("Enter User password: ");
        String password = scanner.nextLine();
        
        System.out.println("Enter Faculty ID: ");
        int facultyId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Retrieve the Faculty object based on the faculty ID
        Faculity faculty = facultyService.getFaculityById(facultyId); // Assuming you have a method to get a faculty by ID

        if (faculty == null) {
            System.out.println("Faculty with ID " + facultyId + " does not exist. Please try again.");
            return; // Exit the method if the faculty does not exist
        }

        FaculityAccount account = new FaculityAccount();
        account.setUsername(name);
        account.setPassword(password);
        account.setFaculty(faculty); // Set the retrieved Faculty object

        facultyAccountService.addFacultyAccount(account);
        System.out.println("Faculty Account added successfully!");
    }

    
    
    private void updateFaculityAccount() {
        System.out.println("Enter Account ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        FaculityAccount account = facultyAccountService.getFacultyAccountById(id);
        if (account != null) {
            System.out.println("Enter New Account Name: ");
            String name = scanner.nextLine();
            account.setUsername(name);

            System.out.println("Enter New Faculty ID: ");
            int facultyId = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            // Retrieve the Faculty object based on the new faculty ID
            Faculity faculty = facultyService.getFaculityById(facultyId); // Assuming you have a method to get a faculty by ID

            if (faculty == null) {
                System.out.println("Faculty with ID " + facultyId + " does not exist. Please try again.");
                return; // Exit the method if the faculty does not exist
            }

            // Set the new Faculty object in the account
            account.setFaculty(faculty);

            // Update the account in the database
            facultyAccountService.updateFacultyAccount(account);

            System.out.println("Faculty Account updated successfully!");
        } else {
            System.out.println("Faculty Account not found.");
        }
    }


    private void deleteFaculityAccount() {
        System.out.println("Enter Account ID to delete: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        facultyAccountService.deleteFacultyAccount(id);
        System.out.println("Faculty Account deleted successfully!");
    }

    private void viewFaculityAccountById() {
        System.out.println("Enter Account ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        FaculityAccount account = facultyAccountService.getFacultyAccountById(id);
        if (account != null) {
            System.out.println("Faculty Account Details: " + account);
        } else {
            System.out.println("Faculty Account not found.");
        }
    }

    private void viewAllFaculityAccounts() {
        System.out.println("All Faculty Accounts:");
        List<FaculityAccount> accounts = facultyAccountService.getAllFacultyAccounts();
        for (FaculityAccount account : accounts) {
            System.out.println(account);
        }
    }

}
