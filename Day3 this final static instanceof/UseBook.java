import java.util.Scanner;

class Book {
    // Instance variables
    private static String libraryName;
    private String title;
    private String author;
    private final int isbn;
    // Constructors
    // Parameterized constructor
    public Book(String libraryName,String title,String authour,int isbn){
        this.libraryName=libraryName;
        this.title=title;
        this.author=authour;
        this.isbn=isbn;
    }
    public static void displayLibraryName(){
        System.out.println("Library Name is "+libraryName);
    }
    // Display method
    public void display(){
        displayLibraryName();
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("ISBN: "+isbn);
    }
   
}

public class UseBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Libarary Name");
        String libName=sc.nextLine();
        System.out.println("Enter the title of the book: ");
        String title = sc.nextLine();
        System.out.println("Enter the author of the book: ");
        String author = sc.nextLine();
        System.out.println("Enter Isbn ");
        int isbn=sc.nextInt();

        Book b=new Book(libName, title, author, isbn);
        // Displaying the details
        if(b instanceof Book){
            System.out.println("This is instance of Book");
        }
        b.display();
        // Closing the scanner
        sc.close();
    }
}
