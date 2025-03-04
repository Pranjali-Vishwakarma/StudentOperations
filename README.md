# StudentOperations

## Overview
This is a **menu-driven Java program** that demonstrates the concepts of **classes, constructors, instance members, and array of objects** in Java.  
The program allows users to **add, display, search, update, and delete student records** using an `ArrayList`.  

## Project Structure
The project contains the following files:

### 1️**Student.java**
- Represents a student with attributes: **PRN, Name, Date of Birth, and Marks**.
- Contains:
  - **Constructor** to initialize student details.
  - **Getters and Setters** to access and modify student attributes.
  - `displayStudent()` → Displays student details.

### 2️**StudentOperations.java**
- Handles all operations related to students.
- Functions included:
  - `addStudent(String prn, String name, String dob, double marks)` → Adds a new student.
  - `displayStudents()` → Displays all student records.
  - `searchByPrn(String prn)` → Finds a student by PRN.
  - `searchByName(String name)` → Finds a student by name.
  - `searchByPosition(int index)` → Finds a student at a given position.
  - `updateStudent(String prn, String newName, String newDob, double newMarks)` → Updates a student's details.
  - `deleteStudent(String prn)` → Deletes a student by PRN.

### 3️**Main.java**
- Contains the **menu-driven program**.
- Displays a menu and allows users to interact with the system.
- Uses **Scanner** for input handling.
- Calls functions from `StudentOperations.java` based on user selection.

## How to Run
1. Open the project in **IntelliJ IDEA** or any Java IDE.
2. Run **Main.java**.
3. Follow the menu options to interact with the system.

## Git Workflow
This repository follows a structured commit history:
- **Separate commits** for each file and function.
- **Meaningful commit messages** (e.g., `"Added StudentOperations.java with CRUD functions"`).

## Features Implemented
✅ Add Student  
✅ Display All Students  
✅ Search by PRN  
✅ Search by Name  
✅ Search by Position  
✅ Update Student Details  
✅ Delete Student  
✅ Exit Program  

## Future Improvements
🔹 Add file handling to store student records permanently.  
🔹 Implement GUI using JavaFX or Swing.  

## Author
**Pranjali Vishwakarma**  
