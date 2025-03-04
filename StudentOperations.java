import java.util.ArrayList;

public class StudentOperations {
    private final ArrayList<Student> students;

    public StudentOperations() {
        students = new ArrayList<>();
    }

    // 1. Add Student
    public void addStudent(String prn, String name, String dob, double marks) {
        students.add(new Student(prn, name, dob, marks));
        System.out.println("Student added successfully.");
    }

    // 2. Display All Students
    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            System.out.println("Student List:");
            for (Student s : students) {
                s.displayStudent();
            }
        }
    }

    // 3. Search Student by PRN
    public Student searchByPrn(String prn) {
        for (Student s : students) {
            if (s.getPrn().equalsIgnoreCase(prn)) {
                return s;
            }
        }
        return null;
    }

    // 4. Search Student by Name
    public Student searchByName(String name) {
        for (Student s : students) {
            if (s.getName().equalsIgnoreCase(name)) {
                return s;
            }
        }
        return null;
    }

    // 5. Search Student by Position (Index)
    public Student searchByPosition(int index) {
        if (index >= 0 && index < students.size()) {
            return students.get(index);
        }
        return null;
    }

    // 6. Update Student Details
    public boolean updateStudent(String prn, String newName, String newDob, double newMarks) {
        Student s = searchByPrn(prn);
        if (s != null) {
            s.setName(newName);
            s.setDob(newDob);
            s.setMarks(newMarks);
            return true;
        }
        return false;
    }

    // 7. Delete Student
    public boolean deleteStudent(String prn) {
        Student s = searchByPrn(prn);
        if (s != null) {
            students.remove(s);
            return true;
        }
        return false;
    }
}
