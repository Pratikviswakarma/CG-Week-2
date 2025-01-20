import java.util.Scanner;

class LibraryBookSystem {
    // Instance variables
    private String title;
    private String author;
    private double price;
    private char avilability;
    // Constructors
    public LibraryBookSystem(){
        title="Let us c";
        author="Unknown";
        price=450.00;
        avilability='Y';
    }
    // Parameterized constructor
    public LibraryBookSystem(String title,String authour,double price,char avilability){
        this.title=title;
        this.author=authour;
        this.price=price;
        this.avilability=avilability;
    }
    // Copy constructor
    public LibraryBookSystem(LibraryBookSystem lbs){
        this.title= lbs.title;
        this.author=lbs.author;
        this.price=lbs.price;
        this.avilability=lbs.avilability;
    }
    // Display method
    public void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
        System.out.println("Avilability: "+avilability);
    }
    // Method to borrow the book
    public String borrowBook(String wtitle,String title){
        if(avilability=='Y'  || avilability=='y' && wtitle.equals(title)){
            avilability='N';
            return title+" Book issued sucessfully...";
        }
        return title+" Currently Book is not avilabile...";
    }
}

public class UseLibraryBookSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the title of the book: ");
        String title = sc.nextLine();
        System.out.println("Enter the author of the book: ");
        String author = sc.nextLine();
        System.out.println("Enter the price of the book: ");
        double price = sc.nextDouble();
        System.out.println("Enter the avilability of the book: ");
        char avilability = sc.next().charAt(0);
        // Creating objects
        LibraryBookSystem lbs1 = new LibraryBookSystem();
        LibraryBookSystem lbs2 = new LibraryBookSystem(title, author, price, avilability);
        LibraryBookSystem lbs3=new LibraryBookSystem(lbs2);
        System.out.println("Enter book title you want");
        String wtitle=sc.next();
        // Borrowing the book
        lbs1.borrowBook(wtitle,title);
        lbs2.borrowBook(wtitle, title);
        lbs3.borrowBook(wtitle, title);
        // Displaying the details
        lbs1.display();
        lbs2.display();
        lbs3.display();
        // Closing the scanner
        sc.close();
    }
}
