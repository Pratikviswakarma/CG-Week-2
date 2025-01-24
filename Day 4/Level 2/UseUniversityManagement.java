// Course class
class Course {
    private String courseName;
    private Professor professor;
    private Student[] students;
    private int studentCount;

    // Constructor
    public Course(String courseName, int maxStudents) {
        this.courseName = courseName;
        this.professor = null; // Initially, no professor is assigned
        this.students = new Student[maxStudents]; // Fixed size array for students
        this.studentCount = 0;
    }

    // Assign professor to the course
    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println("Professor " + professor.getName() + " assigned to course " + courseName);
    }

    // Enroll a student in the course
    public void enrollStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
            System.out.println("Student " + student.getName() + " enrolled in course " + courseName);
        } else {
            System.out.println("Course " + courseName + " is full.");
        }
    }

    // Display course details
    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor: " + (professor != null ? professor.getName() : "No professor assigned"));
        System.out.println("Enrolled Students:");
        for (int i = 0; i < studentCount; i++) {
            System.out.println("- " + students[i].getName());
        }
    }

    // Get course name
    public String getCourseName() {
        return courseName;
    }
}

// Professor class
class Professor {
    private String name;

    // Constructor
    public Professor(String name) {
        this.name = name;
    }

    // Get professor name
    public String getName() {
        return name;
    }

    // Assign to a course (communication)
    public void assignToCourse(Course course) {
        course.assignProfessor(this);
    }
}

// Student class
class Student {
    private String name;
    private Course[] courses;
    private int courseCount;

    // Constructor
    public Student(String name, int maxCourses) {
        this.name = name;
        this.courses = new Course[maxCourses]; // Fixed size array for courses
        this.courseCount = 0;
    }

    // Enroll in a course
    public void enrollCourse(Course course) {
        if (courseCount < courses.length) {
            courses[courseCount] = course;
            course.enrollStudent(this); // Add student to course
            courseCount++;
        } else {
            System.out.println("Student " + name + " cannot enroll in more courses.");
        }
    }

    // Get student name
    public String getName() {
        return name;
    }

    // Display enrolled courses
    public void displayEnrolledCourses() {
        System.out.println(name + " is enrolled in the following courses:");
        for (int i = 0; i < courseCount; i++) {
            System.out.println("- " + courses[i].getCourseName());
        }
    }
}

// Main class to demonstrate relationships and interactions
public class  UseUniversityManagement {
   
    public static void main(String[] args) {
        // Create professors
        Professor professor1 = new Professor("Dr. Smith");
        Professor professor2 = new Professor("Dr. Johnson");

        // Create courses
        Course course1 = new Course("Computer Science 101", 3);
        Course course2 = new Course("Mathematics 101", 3);

        // Assign professors to courses
        professor1.assignToCourse(course1);
        professor2.assignToCourse(course2);

        // Create students
        Student student1 = new Student("Alice", 3);
        Student student2 = new Student("Bob", 3);

        // Students enroll in courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);

        // Display student course enrollments
        student1.displayEnrolledCourses();
        student2.displayEnrolledCourses();

        // Display course details
        course1.displayCourseDetails();
        course2.displayCourseDetails();
    }
}
