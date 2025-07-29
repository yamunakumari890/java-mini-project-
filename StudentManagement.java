import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
  private static ArrayList<Student> studentList = new ArrayList<>();
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int choice;

    do {
      System.out.println("\n==== Student Management System ==== ");
      System.out.println("1. Add Student");
      System.out.println("2. Display All Students");
      System.out.println("3. Search Student by Roll Numbers");
      System.out.println("4. Delete Student by Roll Number");
      System.out.println("5. Exit");
      System.out.println("Enter your choice: ");
      choice = scanner.nextInt();
      switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayAllStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Exiting the system... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter between 1–5.");
            }

        } while (choice != 5);
    }

    private static void addStudent() {
        System.out.print("Enter Roll No: ");
        int roll = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Course: ");
        String course = scanner.nextLine();
        System.out.print("Enter Marks: ");
        int marks = scanner.nextInt();

        Student s = new Student(roll, name, course, marks);
        studentList.add(s);
        System.out.println("✅ Student added successfully!");
    }

    private static void displayAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students to display.");
            return;
        }

        System.out.println("\n--- Student Records ---");
        for (Student s : studentList) {
            s.display();
        }
    }

    private static void searchStudent() {
        System.out.print("Enter Roll No to search: ");
        int roll = scanner.nextInt();
        boolean found = false;

        for (Student s : studentList) {
            if (s.getRollNo() == roll) {
                System.out.println("✅ Student Found:");
                s.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("❌ Student not found with Roll No: " + roll);
        }
    }

    private static void deleteStudent() {
        System.out.print("Enter Roll No to delete: ");
        int roll = scanner.nextInt();
        boolean removed = false;

        for (Student s : studentList) {
            if (s.getRollNo() == roll) {
                studentList.remove(s);
                System.out.println("✅ Student deleted successfully.");
                removed = true;
                break;
            }
        }

        if (!removed) {
            System.out.println("❌ Student not found with Roll No: " + roll);
        }
    }
}

//Run:- javac Student.java StudentManagement.java 
//java StudentManagement
