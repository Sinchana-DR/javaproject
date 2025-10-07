import java.util.*;

public class StudentManagement {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();
        students.add(new Student(id, name, age, marks));
        System.out.println("✅ Student added successfully!\n");
    }

    public void viewAllStudents() {
        if (students.isEmpty()) {
            System.out.println("⚠️ No student records found.\n");
            return;
        }
        System.out.println("📋 Student List:");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();
    }

    public void updateStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID to update: ");
        int id = sc.nextInt();
        for (Student s : students) {
            if (s.getId() == id) {
                sc.nextLine();
                System.out.print("Enter new Name: ");
                s.setName(sc.nextLine());
                System.out.print("Enter new Age: ");
                s.setAge(sc.nextInt());
                System.out.print("Enter new Marks: ");
                s.setMarks(sc.nextDouble());
                System.out.println("✅ Record updated successfully!\n");
                return;
            }
        }
        System.out.println("❌ Student ID not found.\n");
    }

    public void deleteStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID to delete: ");
        int id = sc.nextInt();
        Iterator<Student> itr = students.iterator();
        while (itr.hasNext()) {
            Student s = itr.next();
            if (s.getId() == id) {
                itr.remove();
                System.out.println("🗑️ Student deleted successfully!\n");
                return;
            }
        }
        System.out.println("❌ Student not found.\n");
    }
}
