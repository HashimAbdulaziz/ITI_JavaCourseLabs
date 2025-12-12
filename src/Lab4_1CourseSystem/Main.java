package CourseSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Course> allCourses = new ArrayList<>();
        allCourses.add(new Course(101, "OOP", 3));
        allCourses.add(new Course(102, "Databases", 3));
        allCourses.add(new Course(103, "Data Structures", 4));

        ArrayList<Student> students = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Student Courses System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Register Courses for Student");
            System.out.println("3. Print Student Report");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    Integer id = Integer.valueOf(scanner.nextLine().trim());
                    System.out.print("Enter Full Name: ");
                    String name = scanner.nextLine().trim();
                    students.add(new Student(id, name));
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    System.out.print("Enter Student ID to register courses: ");
                    Integer sid = Integer.valueOf(scanner.nextLine().trim());
                    Student student = students.stream()
                            .filter(s -> s.getStudentId().equals(sid))
                            .findFirst()
                            .orElse(null);
                    if (student == null) {
                        System.out.println("Student not found.");
                        break;
                    }

                    System.out.println("Available Courses:");
                    for (Course c : allCourses) {
                        System.out.println("  " + c);
                    }
                    System.out.println("Enter courses as: \"courseId,grade;courseId,grade\" (e.g., 101,85.5;102,90)");
                    String input = scanner.nextLine();
                    student.registerMultipleCourses(input, allCourses);
                    break;

                case 3:
                    System.out.print("Enter Student ID for report: ");
                    Integer rid = Integer.valueOf(scanner.nextLine().trim());
                    Student repStudent = students.stream()
                            .filter(s -> s.getStudentId().equals(rid))
                            .findFirst()
                            .orElse(null);
                    if (repStudent != null) {
                        System.out.println(repStudent.printReport());
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}