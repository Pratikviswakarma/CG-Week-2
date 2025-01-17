import java.util.Scanner; // Importing Scanner class for user input

// Class representing a cart item in a shopping cart
class CartItem {
    private String itemName; // Name of the item
    private double price; // Price of a single item
    private int quantity; // Quantity of the item in the cart

    private double total; // Total cost for the item (price * quantity)

    // Constructor to initialize the CartItem with item name, price, and quantity
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName; // Assign the item name to the class variable
        this.price = price; // Assign the price to the class variable
        this.quantity = quantity; // Assign the quantity to the class variable
    }

    // Method to add a specified quantity to the existing quantity of the item
    public void addItems(int quantity) {
        this.quantity += quantity; // Increase the quantity by the specified amount
    }

    // Method to remove a specified quantity from the existing quantity of the item
    public void removeItems(int quantity) {
        if (this.quantity >= quantity) { // Check if the existing quantity is sufficient
            this.quantity -= quantity; // Reduce the quantity by the specified amount
        } else {
            System.out.println("Insufficient quantity"); // Print a message if quantity is insufficient
        }
    }

    // Method to calculate the total cost of the item based on price and quantity
    public void calculate() {
        total = price * quantity; // Calculate total cost
    }

    // Method to display the details of the cart item
    public void display() {
        System.out.println("Item Name: " + itemName); // Display the item name
        System.out.println("Price: " + price); // Display the price of the item
        System.out.println("Quantity: " + quantity); // Display the quantity of the item
        System.out.println("Total price: " + total); // Display the total cost
    }
}

// Main class to demonstrate the CartItem class
public class UseCartItem {

    // Main method where the program execution begins
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter item details
        System.out.println("Enter item name, price, and quantity ");
        System.out.println("Enter item name:");
        String itemName = sc.nextLine(); // Read the item name

        System.out.println("Enter price:");
        double price = sc.nextDouble(); // Read the price of the item

        System.out.println("Enter quantity:");
        int quantity = sc.nextInt(); // Read the quantity of the item

        // Create a CartItem object with the entered details
        CartItem item = new CartItem(itemName, price, quantity);

        // Calculate the total price for the item
        item.calculate();

        // Display the details of the cart item
        item.display();

        sc.close(); // Close the Scanner to release resources
    }
}
