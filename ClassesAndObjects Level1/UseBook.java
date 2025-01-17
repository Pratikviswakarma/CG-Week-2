import java.util.Scanner; // Import the Scanner class to take input from the user

// Class representing a Book with attributes title, author, and price
class Book {
    private String title;  // Title of the book
    private String author; // Author of the book
    private double price;  // Price of the book
    
    // Constructor to initialize the Book object with title, author, and price
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
	
    // Method to display the details of the book
    public void display() {
        System.out.println("Title of Book: " + title);   // Print the title of the book
        System.out.println("Author is: " + author);      // Print the author of the book
        System.out.println("Price is: " + price);        // Print the price of the book
    }
}

// Main class to use the Book class
public class UseBook {
   
    // Main method where the program execution starts
    public static void main(String[] args) {
  
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter details of the book
        System.out.println("Enter book name, author name and price of book");
        
        // Read the title of the book
        System.out.println("Enter name");
        String name = sc.nextLine();
        
        // Read the author of the book
        System.out.println("Enter author name");
        String author = sc.nextLine();
        
        // Read the price of the book
        System.out.println("Enter price");
        double price = sc.nextDouble();
        
        // Create a Book object with the inputted details
        Book book = new Book(name, author, price);
        
        // Call the display method to print the book details
        book.display();
        
        // Close the Scanner object to release resources
        sc.close();
    }   
}
