package Lab4_1CourseSystem;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Student implements Register {
    private Integer studentId;
    private String name;
    private ArrayList<CourseRegistration> registrations;

    // Constructor
    public Student(Integer studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.registrations = new ArrayList<>();
    }

    @Override
    public void registerCourse(Course course, Double grade) {
        registrations.add(new CourseRegistration(course, grade));
    }

    public void registerMultipleCourses(String input, ArrayList<Course> allCourses) {
        StringTokenizer st = new StringTokenizer(input, ";");
        while (st.hasMoreTokens()) {
            String token = st.nextToken().trim();
            StringTokenizer pair = new StringTokenizer(token, ",");
            if (pair.countTokens() == 2) {
                try {
                    Integer cid = Integer.valueOf(pair.nextToken().trim());
                    Double grade = Double.valueOf(pair.nextToken().trim());
                    // Find course by ID
                    Course matched = allCourses.stream()
                            .filter(c -> c.getCourseId().equals(cid))
                            .findFirst()
                            .orElse(null);
                    if (matched != null) {
                        registerCourse(matched, grade);
                    } else {
                        System.out.println("Course ID " + cid + " not found.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid: " + token);
                }
            }
        }
    }


    // Inner Class
    public class CourseRegistration {
        private Course course;
        private Double grade; // Wrapper class → autoboxing/unboxing

        public CourseRegistration(Course course, Double grade) {
            this.course = course;
            this.grade = grade;
        }

        public Course getCourse() {
            return course;
        }

        public Double getGrade() {
            return grade;
        }
    }


    public String printReport() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student Report\n");
        sb.append("ID: ").append(studentId).append("\n");
        sb.append("Name: ").append(name).append("\n");
        sb.append("Registered Courses:\n");

        if (registrations.isEmpty()) {
            sb.append("  (No courses registered)\n");
        } else {
            for (CourseRegistration reg : registrations) {
                String gradeStr = (reg.getGrade() != null) ? reg.getGrade().toString() : "N/A";
                sb.append("  - ").append(reg.getCourse().getCourseName()).append(" | Grade: ").append(gradeStr)
                        .append(" | Credits: ").append(reg.getCourse().getCreditHours())
                        .append("\n");
            }
        }
        return sb.toString();
    }


    public Integer getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public ArrayList<CourseRegistration> getRegistrations() {
        return registrations;
    }
}