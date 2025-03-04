/*
Name: Pranjali Vishwakarma
PRN: 23070126092
Batch: SY AIML B1
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentOperations studentOps = new StudentOperations();
        int choice;

        do {
            // Display Menu
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by PRN");
            System.out.println("4. Search Student by Name");
            System.out.println("5. Search Student by Position");
            System.out.println("6. Update Student Details");
            System.out.println("7. Delete Student");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add Student
                    System.out.print("Enter PRN: ");
                    String prn = sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Date of Birth (DD-MM-YYYY): ");
                    String dob = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();
                    studentOps.addStudent(prn, name, dob, marks);
                    break;

                case 2:
                    // Display Students
                    studentOps.displayStudents();
                    break;

                case 3:
                    // Search by PRN
                    System.out.print("Enter PRN to search: ");
                    String searchPrn = sc.nextLine();
                    Student foundByPrn = studentOps.searchByPrn(searchPrn);
                    if (foundByPrn != null) {
                        foundByPrn.displayStudent();
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    // Search by Name
                    System.out.print("Enter Name to search: ");
                    String searchName = sc.nextLine();
                    Student foundByName = studentOps.searchByName(searchName);
                    if (foundByName != null) {
                        foundByName.displayStudent();
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    // Search by Position
                    System.out.print("Enter Position (Index starts from 0): ");
                    int index = sc.nextInt();
                    Student foundByPosition = studentOps.searchByPosition(index);
                    if (foundByPosition != null) {
                        foundByPosition.displayStudent();
                    } else {
                        System.out.println("Invalid position.");
                    }
                    break;

                case 6:
                    // Update Student
                    System.out.print("Enter PRN to update: ");
                    String updatePrn = sc.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter New Date of Birth: ");
                    String newDob = sc.nextLine();
                    System.out.print("Enter New Marks: ");
                    double newMarks = sc.nextDouble();
                    if (studentOps.updateStudent(updatePrn, newName, newDob, newMarks)) {
                        System.out.println("Student updated successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 7:
                    // Delete Student
                    System.out.print("Enter PRN to delete: ");
                    String deletePrn = sc.nextLine();
                    if (studentOps.deleteStudent(deletePrn)) {
                        System.out.println("Student deleted successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 8:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 8);

        sc.close();
    }
}
