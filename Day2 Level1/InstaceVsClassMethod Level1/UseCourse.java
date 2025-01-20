import java.util.Scanner;

class Course{
    // Instance variables
    private String courseName;
    private int duration;
    private double fee;
    // Static variable
    private static String instituteName;
    // Constructor
    public Course() {
        courseName = "Java";
        duration = 30;
        fee = 10000;
    }
    
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    // Instance methods
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: " + fee);
    }
    // Static method
    public static void updateInstituteName(String name) {
        instituteName = name;
    }

}

public class UseCourse {
  public static void main(String[] args) {
    // Create Scanner object
    Scanner sc = new Scanner(System.in);
    // Read input
    System.out.println("Enter the Course name: ");
    String courseName = sc.next();
    System.out.println("Enter the Duration: ");
    int duration = sc.nextInt();
    System.out.println("Enter the Fee: ");
    double fee = sc.nextDouble();
    // Create Course object
    Course course = new Course();
    Course course2 = new Course(courseName, duration, fee);
    // Call instance methods
    course.displayCourseDetails();
    course2.displayCourseDetails();
    // Call static method
    Course.updateInstituteName("ABC Institute");
    // Close Scanner
    sc.close();
  }  
}
