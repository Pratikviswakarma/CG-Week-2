import java.util.Scanner; // Import the Scanner class to take input from the user

// Class representing the calculations for area and circumference of a circle
class AreaOfCircle {
    private int radius;            // Radius of the circle
    private double areaOfCirle;    // Area of the circle
    private double circumOfCircle; // Circumference of the circle
    
    // Constructor to initialize the radius of the circle
    public AreaOfCircle(int radius) {
        this.radius = radius;
    }
    
    // Method to calculate the area and circumference of the circle
    public void calculate() {
        circumOfCircle = 2 * 3.14 * radius; // Calculate the circumference
        areaOfCirle = 3.14 * radius * radius; // Calculate the area
    }
	
    // Method to display the calculated area and circumference
    public void display() {
        System.out.println("Circumference of circle: " + circumOfCircle); // Print the circumference
        System.out.println("Area of circle: " + areaOfCirle); // Print the area
    }
}

// Main class to use the AreaOfCircle class
public class UseAreaOfCircle {
   
    // Main method where the program execution starts
    public static void main(String[] args) {
  
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the radius
        System.out.println("Enter radius for area and circumference of circle ");
        System.out.println("Enter radius");
        int radius = sc.nextInt(); // Read the radius input from the user
        
        // Create an AreaOfCircle object using the input radius
        AreaOfCircle aoc = new AreaOfCircle(radius);
        
        // Call the calculate method to compute the area and circumference
        aoc.calculate();
        
        // Call the display method to show the results
        aoc.display();
        
        // Close the Scanner to free resources
        sc.close();
    }   
}
