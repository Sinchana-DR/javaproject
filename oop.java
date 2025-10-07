class Student {
    String name;
    int roll;
    double marks;

    Student(String n, int r, double m) {
        name = n;
        roll = r;
        marks = m;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll: " + roll + ", Marks: " + marks);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student("Reshma", 101, 89.5);
        Student s2 = new Student("Sinchana", 102, 92.0);
        s1.display();
        s2.display();
    }
}
