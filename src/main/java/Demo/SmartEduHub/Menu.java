package Demo.SmartEduHub;




import java.util.Scanner;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);
    private final SubMenu subMenu = new SubMenu();

    public void displayMainMenu() {
        while (true) {
            System.out.println("\n=== SmartEduHub Main Menu ===");
            System.out.println("1. Manage Students");
            System.out.println("2. Manage Faculty");
            System.out.println("3. Manage Library");
            System.out.println("4. Manage Student Accounts");
            System.out.println("5. Manage Courses");
            System.out.println("6. Manage Faculty Accounts");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    subMenu.manageStudents();
                    break;
                case 2:
                    subMenu.manageFaculty();
                    break;
                case 3:
                    subMenu.manageLibrary();
                    break;
                case 4:
                    subMenu.manageStudentAccounts();
                    break;
                case 5:
                    subMenu.manageCourses();
                    break;
                case 6:
                    subMenu.manageFacultyAccounts();
                    break;
                case 7:
                    System.out.println("Exiting... Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}



