import java.util.Scanner; // Importing Scanner class for user input

// Class representing a cart item in a shopping cart
class UserCart {
    private final int productId;
    private String productName; // Name of the item
    private double price; // Price of a single item
    private int quantity; // Quantity of the item in the cart
    private static int discount;

    // Constructor to initialize the CartItem with item name, price, and quantity
    public UserCart(String productName, double price, int quantity,int productId,int discount) {
        this.productName = productName; // Assign the item name to the class variable
        this.price = price; // Assign the price to the class variable
        this.quantity = quantity; // Assign the quantity to the class variable
        this.productId=productId;
        this.discount=discount;
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
        price = price * quantity; // Calculate total cost
    }

    // Method to display the details of the cart item
    public void display() {
        System.out.println("Product id is "+productId);
        System.out.println("Item Name: " + productName); // Display the item name
        System.out.println("Price: " + price); // Display the price of the item
        System.out.println("Quantity: " + quantity); // Display the quantity of the item
        System.out.println("discount applied "+discount+" %");
    }

    public static void updateDiscount(int newDiscount){
        discount=newDiscount;
    }
}

// Main class to demonstrate the CartItem class
public class UseUserCart {

    // Main method where the program execution begins
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter item details
        System.out.println("Enter product id, product name ,price , quantity and discount ");
        System.out.println("Enter product id :");
        int productId = sc.nextInt(); // Read the item name

        System.out.println("Enter product name:");
        String productName = sc.next(); // Read the price of the item

        System.out.println("Enter price ");
        double price = sc.nextDouble(); // Read the quantity of the item

        System.out.println("Enter quantity ");
        int quantity=sc.nextInt();

        System.out.println("Enter discount ");
        int discount=sc.nextInt();
        // Create a CartItem object with the entered details
        UserCart item = new UserCart(productName,price,quantity,productId,discount);

        if(item instanceof UserCart){
            System.out.println("This is instance of UserCart ");
        }
        // Calculate the total price for the item
        item.calculate();
        item.display();
        System.out.println("Update discount percentage ");
        int newDiscount=sc.nextInt();
        UserCart.updateDiscount(newDiscount);
        // Display the details of the cart item
        item.calculate();
        item.display();

        sc.close(); // Close the Scanner to release resources
    }
}
