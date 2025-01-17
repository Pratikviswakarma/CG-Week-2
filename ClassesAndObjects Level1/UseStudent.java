import java.util.Scanner; // Import the Scanner class for user input

// Class representing a Student with attributes for name, id, marks, and grade
class Student {
    private String name;   // Name of the student
    private int id;        // ID of the student
    private double marks;  // Marks obtained by the student
    private String grade;  // Grade of the student based on marks

    // Constructor to initialize the Student object with name, id, and marks
    public Student(String name, int id, double marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    // Method to calculate the grade based on the marks
    public void calculate() {
        if (marks >= 90) {
            grade = "A";  // Assign grade A if marks are 90 or above
        } else if (marks >= 80) {
            grade = "B";  // Assign grade B if marks are between 80 and 89
        } else if (marks >= 70) {
            grade = "C";  // Assign grade C if marks are between 70 and 79
        } else if (marks >= 60) {
            grade = "D";  // Assign grade D if marks are between 60 and 69
        } else {
            grade = "F";  // Assign grade F if marks are below 60
        }
    }

    // Method to display the details of the student
    public void display() {
        System.out.println("Name: " + name);   // Print the name of the student
        System.out.println("ID: " + id);       // Print the ID of the student
        System.out.println("Marks: " + marks); // Print the marks obtained by the student
        System.out.println("Grade: " + grade); // Print the grade of the student
    }
}

// Main class to use the Student class
public class UseStudent {
  
    // Main method where the program execution starts
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object for user input
        
        // Prompt the user to enter the student's details
        System.out.println("Enter Student name, id and marks");
        
        // Read the student's name
        System.out.println("Enter name");
        String name = sc.nextLine();
        
        // Read the student's ID
        System.out.println("Enter id");
        int id = sc.nextInt();
        
        // Read the student's marks
        System.out.println("Enter marks");
        double marks = sc.nextDouble();
        
        // Create a Student object with the inputted details
        Student student = new Student(name, id, marks);
        
        // Call the calculate method to determine the grade
        student.calculate();
        
        // Call the display method to print the student's details and grade
        student.display();
        
        // Close the Scanner object to release resources
        sc.close();
    }
}
