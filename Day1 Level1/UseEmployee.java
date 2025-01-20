import java.util.Scanner; // Import the Scanner class for taking input from the user

// Class representing an Employee with attributes name, id, and salary
class Employee {
    private String name; // Employee's name
    private int id;      // Employee's ID
    private double salary; // Employee's salary
    
    // Constructor to initialize the Employee object with name, id, and salary
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    // Method to display the details of the Employee
    public void display() {
        System.out.println("Name: " + name);    // Print the Employee's name
        System.out.println("ID: " + id);        // Print the Employee's ID
        System.out.println("Salary: " + salary); // Print the Employee's salary
    }
}

// Main class to use the Employee class
public class UseEmployee {
   
    // Main method where the execution starts
    public static void main(String[] args) {
  
        // Create a Scanner object for taking input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter Employee details
        System.out.println("Enter Employee name, id and salary ");
        
        // Prompt and read the Employee's name
        System.out.println("Enter name");
        String name = sc.nextLine();
        
        // Prompt and read the Employee's ID
        System.out.println("Enter id ");
        int id = sc.nextInt();
        
        // Prompt and read the Employee's salary
        System.out.println("Enter salary");
        double salary = sc.nextDouble();
        
        // Create an Employee object with the inputted details
        Employee emp = new Employee(name, id, salary);
        
        // Call the display method to print the Employee details
        emp.display();
        
        // Close the Scanner object to release resources
        sc.close();
    }   
}
