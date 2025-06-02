

---

# 📚 Student Management System (Java)

A simple console-based Student Management System built in Java.
This system allows you to add student records, view all students, and search for a student by their roll number.

---

## 🛠️ Features

* Add new students with roll number, name, and marks.
* View all students stored in the system.
* Search for a student by roll number.
* Exit the program gracefully.

---

## 📂 Project Structure

* **`Main`**: Contains the main program loop with a menu interface.
* **`Student`**: Represents the student entity with attributes and methods.
* **`StudentManager`**: Manages the list of students and provides add, view, and search functionalities.

---

## 🚀 How to Run

### Prerequisites

* Java JDK installed (version 8 or above)

### Steps

1. Save all the `.java` files inside the folder `QuestionsPractice/JavaProject`.

2. Compile the code:

   ```bash
   javac QuestionsPractice/JavaProject/*.java
   ```

3. Run the program:

   ```bash
   java QuestionsPractice.JavaProject.Main
   ```

---

## 🎯 Sample Usage

```
===== Student Management System =====
1. Add Student
2. View All Students
3. Search Student by Roll Number
4. Exit
Choose an option: 1
Enter Roll No: 101
Enter Name: Alice
Enter Marks: 88
Student added.

===== Student Management System =====
1. Add Student
2. View All Students
3. Search Student by Roll Number
4. Exit
Choose an option: 2
Roll No: 101, Name: Alice, Marks: 88

===== Student Management System =====
1. Add Student
2. View All Students
3. Search Student by Roll Number
4. Exit
Choose an option: 3
Enter Roll Number to Search: 101
Roll No: 101, Name: Alice, Marks: 88

===== Student Management System =====
1. Add Student
2. View All Students
3. Search Student by Roll Number
4. Exit
Choose an option: 4
Exiting...
```

---

## 💡 Concepts Used

* Object-Oriented Programming (OOP) in Java
* ArrayList for dynamic storage
* Console I/O using Scanner
* Control flow with loops and switch-case

---
