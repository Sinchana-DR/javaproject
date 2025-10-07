import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagement sm = new StudentManagement();
        int choice;

        do {
            System.out.println("===== 🏫 Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: sm.addStudent(); break;
                case 2: sm.viewAllStudents(); break;
                case 3: sm.updateStudent(); break;
                case 4: sm.deleteStudent(); break;
                case 5: System.out.println("👋 Exiting..."); break;
                default: System.out.println("❌ Invalid choice. Try again.\n");
            }
        } while (choice != 5);
    }
}
