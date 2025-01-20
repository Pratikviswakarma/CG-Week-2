import java.util.Scanner;

class Book{
    // Instance variables
    private String title;
    private String author;
    private double price;
    // Constructors
    public Book(){
        title = "Not set";
        author = "Not set";
        price = 0.0;
    }
    // Parameterized constructor
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    // Display method
    public void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class UseBook{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the title of the book: ");
        String title = sc.nextLine();
        System.out.println("Enter the author of the book: ");
        String author = sc.nextLine();
        System.out.println("Enter the price of the book: ");
        double price = sc.nextDouble();
        // Creating objects
        Book b1 = new Book();
        Book b2 = new Book(title, author, price);
        // Displaying the details
        b1.display();
        b2.display();
        // Closing the scanner
        sc.close();
    }
}