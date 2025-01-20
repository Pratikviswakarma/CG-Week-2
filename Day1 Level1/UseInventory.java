import java.util.Scanner; // Import the Scanner class for user input

// Class representing an inventory item with attributes like item code, name, price, quantity, and cost
class Inventory {
    private String itemCode; // Code of the inventory item
    private String itemName; // Name of the inventory item
    private double price;    // Price per unit of the inventory item
    private int quantity;    // Quantity of the inventory item
    private double cost;     // Total cost of the inventory items
    
    // Constructor to initialize the Inventory object with item code, name, price, and quantity
    public Inventory(String itemCode, String itemName, double price, int quantity) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
	
    // Method to calculate the total cost based on price and quantity
    public void calculate() {
        cost = price * quantity; // Calculate the total cost
    }
	
    // Method to display the details of the inventory item
    public void display() {
        System.out.println("Item code is: " + itemCode);   // Print the item code
        System.out.println("Item name is: " + itemName);   // Print the item name
        System.out.println("Item price is: " + price);     // Print the item price
        System.out.println("Quantity of item: " + quantity); // Print the item quantity
        System.out.println("Total cost is: " + cost);      // Print the total cost
    }
}

// Main class to use the Inventory class
public class UseInventory {
   
    // Main method where the program execution starts
    public static void main(String[] args) {
  
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter details of the inventory item
        System.out.println("Enter Item code, item name, price, and quantity");
        
        // Read the item code
        System.out.println("Enter Item code");
        String itemCode = sc.next();
        
        // Read the item name
        System.out.println("Enter Item name");
        String itemName = sc.next();
        
        // Read the item price
        System.out.println("Enter price");
        double price = sc.nextDouble();
        
        // Read the quantity of the item
        System.out.println("Enter quantity");
        int quantity = sc.nextInt();
        
        // Create an Inventory object with the inputted details
        Inventory intv = new Inventory(itemCode, itemName, price, quantity);
        
        // Call the calculate method to compute the total cost
        intv.calculate();
        
        // Call the display method to print the inventory details
        intv.display();
        
        // Close the Scanner object to release resources
        sc.close();
    }   
}
