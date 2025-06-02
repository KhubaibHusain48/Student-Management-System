package QuestionsPractice.JavaProject;

import java.util.ArrayList;

public class StudentManager {
    private ArrayList<Student> studentList = new ArrayList<>();

    public void addStudent(Student s) {
        studentList.add(s);
    }

    public void viewAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : studentList) {
            System.out.println(s);
        }
    }

    public void searchByRollNumber(int rollNo) {
        for (Student s : studentList) {
            if (s.getRollNumber() == rollNo) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("Student not found.");
    }
}
