// Course class
class Course {
    private String courseName;
    private Student[] enrolledStudents;
    private int studentCount;

    // Constructor
    public Course(String courseName, int maxStudents) {
        this.courseName = courseName;
        this.enrolledStudents = new Student[maxStudents]; // Fixed size
        this.studentCount = 0;
    }

    // Add a student to the course
    public void addStudent(Student student) {
        if (studentCount < enrolledStudents.length) {
            enrolledStudents[studentCount] = student;
            studentCount++;
        } else {
            System.out.println("Course " + courseName + " is full. Cannot enroll more students.");
        }
    }

    // Display course details and enrolled students
    public void displayCourseInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Enrolled Students:");
        for (int i = 0; i < studentCount; i++) {
            System.out.println("- " + enrolledStudents[i].getName());
        }
    }

    // Get course name
    public String getCourseName() {
        return courseName;
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
        this.courses = new Course[maxCourses]; // Fixed size
        this.courseCount = 0;
    }

    // Enroll in a course
    public void enrollInCourse(Course course) {
        if (courseCount < courses.length) {
            courses[courseCount] = course;
            courseCount++;
            course.addStudent(this);
        } else {
            System.out.println("Student " + name + " cannot enroll in more courses.");
        }
    }

    // Display student's courses
    public void displayEnrolledCourses() {
        System.out.println("Student: " + name);
        System.out.println("Enrolled Courses:");
        for (int i = 0; i < courseCount; i++) {
            System.out.println("- " + courses[i].getCourseName());
        }
    }

    // Get student name
    public String getName() {
        return name;
    }
}

// School class
class School {
    private String schoolName;
    private Student[] students;
    private int studentCount;

    // Constructor
    public School(String schoolName, int maxStudents) {
        this.schoolName = schoolName;
        this.students = new Student[maxStudents]; // Fixed size
        this.studentCount = 0;
    }

    // Add a student to the school
    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
        } else {
            System.out.println("School " + schoolName + " is full. Cannot add more students.");
        }
    }

    // Display school details and its students
    public void displaySchoolInfo() {
        System.out.println("School: " + schoolName);
        System.out.println("Students:");
        for (int i = 0; i < studentCount; i++) {
            System.out.println("- " + students[i].getName());
        }
    }
}

// Main class to demonstrate association and aggregation
public class UseStudentAndCourses{
    public static void main(String[] args) {
        // Create a school with a maximum of 3 students
        School school = new School("Greenwood High", 3);

        // Create students with a maximum of 2 courses each
        Student student1 = new Student("Alice", 2);
        Student student2 = new Student("Bob", 2);
        Student student3 = new Student("Charlie", 2);

        // Add students to the school
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        // Create courses with a maximum of 3 students each
        Course math = new Course("Mathematics", 3);
        Course science = new Course("Science", 3);
        Course history = new Course("History", 3);

        // Students enroll in courses
        student1.enrollInCourse(math);
        student1.enrollInCourse(science);
        student2.enrollInCourse(math);
        student3.enrollInCourse(history);

        // Display school details
        school.displaySchoolInfo();
        System.out.println();

        // Display courses for each student
        student1.displayEnrolledCourses();
        System.out.println();
        student2.displayEnrolledCourses();
        System.out.println();
        student3.displayEnrolledCourses();
        System.out.println();

        // Display enrolled students for each course
        math.displayCourseInfo();
        System.out.println();
        science.displayCourseInfo();
        System.out.println();
        history.displayCourseInfo();
    }
}
