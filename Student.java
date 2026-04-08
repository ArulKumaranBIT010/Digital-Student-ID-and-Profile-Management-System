package student.management;

public class Student {

    int id;
    String name;
    String department;
    String email;
    String phone;

    public Student(int StudentID, String StudentName, String StudentDepartment, String StudentEmail, String StudentPhone) {
        this.id = StudentID;
        this.name = StudentName;
        this.department = StudentDepartment;
        this.email = StudentEmail;
        this.phone = StudentPhone;
    }

    public void displayStudent() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
    }
}


