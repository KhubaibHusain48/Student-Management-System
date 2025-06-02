package QuestionsPractice.JavaProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by Roll Number");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    int marks = sc.nextInt();
                    Student s = new Student(roll, name, marks);
                    manager.addStudent(s);
                    System.out.println("Student added.");
                    break;
                case 2:
                    manager.viewAllStudents();
                    break;
                case 3:
                    System.out.print("Enter Roll Number to Search: ");
                    int rollSearch = sc.nextInt();
                    manager.searchByRollNumber(rollSearch);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
