import java.util.Scanner; // Import the Scanner class for user input

// Class representing a Mobile Phone with attributes for brand, model, and price
class MobilePhone {
    private String brand;  // Brand of the mobile phone
    private String model;  // Model of the mobile phone
    private double price;  // Price of the mobile phone
	
    // Constructor to initialize the MobilePhone object with brand, model, and price
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
	
    // Method to display the details of the mobile phone
    public void display() {
        System.out.println("Brand name is: " + brand);   // Print the brand name
        System.out.println("Model name is: " + model);   // Print the model name
        System.out.println("Mobile price is: " + price); // Print the price
    }
}

// Main class to use the MobilePhone class
public class UseMobilePhone {
   
    // Main method where the program execution starts
    public static void main(String[] args) {
  
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the mobile phone details
        System.out.println("Enter Brand, model and price");
        
        // Read the brand of the mobile phone
        System.out.println("Enter brand");
        String brand = sc.next();
        
        // Read the model of the mobile phone
        System.out.println("Enter model");
        String model = sc.next();
        
        // Read the price of the mobile phone
        System.out.println("Enter price");
        double price = sc.nextDouble();
        
        // Create a MobilePhone object with the inputted details
        MobilePhone mp = new MobilePhone(brand, model, price);
        
        // Call the display method to print the mobile phone details
        mp.display();
        
        // Close the Scanner object to release resources
        sc.close();
    }   
}
