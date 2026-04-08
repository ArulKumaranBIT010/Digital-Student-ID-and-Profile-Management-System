package student.management;

import java.util.*;

public class StudentManagement {

	    public static void main(String[] args) {

	        ArrayList<Student> students = new ArrayList<>();
	        Scanner sc = new Scanner(System.in);

	        int choice;

	        do {
	            System.out.println("\n--- Student Management System ---");
	            System.out.println("1. Add Student");
	            System.out.println("2. View Students");
	            System.out.println("3. Exit");

	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();

	            switch(choice) {

	                case 1:
	                    System.out.print("Enter ID: ");
	                    int id = sc.nextInt();
	                    sc.nextLine();

	                    System.out.print("Enter Name: ");
	                    String name = sc.nextLine();

	                    System.out.print("Enter Department: ");
	                    String dept = sc.nextLine();

	                    System.out.print("Enter Email: ");
	                    String email = sc.nextLine();

	                    System.out.print("Enter Phone: ");
	                    String phone = sc.nextLine();

	                    students.add(new Student(id, name, dept, email, phone));
	                    System.out.println("Student Added Successfully!");
	                    break;

	                case 2:
	                    for(Student s : students) {
	                        s.displayStudent();
	                        System.out.println("----------------------");
	                    }
	                    break;

	                case 3:
	                    System.out.println("Exiting...");
	                    break;

	                default:
	                    System.out.println("Invalid Choice");
	            }

	        } while(choice != 3);

	        sc.close();
	    }
	}

