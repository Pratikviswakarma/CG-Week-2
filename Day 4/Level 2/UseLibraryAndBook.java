// Book class
class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Display book details
    public void displayBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

// Library class
class Library {
    private String libraryName;
    private Book[] books;
    private int bookCount;

    // Constructor
    public Library(String libraryName, int capacity) {
        this.libraryName = libraryName;
        this.books = new Book[capacity]; // Fixed-size array for books
        this.bookCount = 0;
    }

    // Add a book to the library
    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("Library is full! Cannot add more books.");
        }
    }

    // Display library details and its books
    public void displayLibraryInfo() {
        System.out.println("Library: " + libraryName);
        System.out.println("Books in the library:");
        for (int i = 0; i < bookCount; i++) {
            books[i].displayBookInfo();
        }
    }
}

// Main class to demonstrate aggregation
public class  UseLibraryAndBook {
    public static void main(String[] args) {
        // Creating books
        Book book1 = new Book("The Alchemist", "Paulo Coelho");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");

        // Creating libraries with fixed capacity
        Library library1 = new Library("City Library", 2); // Capacity: 2 books
        Library library2 = new Library("University Library", 3); // Capacity: 3 books

        // Adding books to libraries
        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book3); // Should display a message that the library is full

        library2.addBook(book2);
        library2.addBook(book3);

        // Display library details
        library1.displayLibraryInfo();
        System.out.println();
        library2.displayLibraryInfo();
    }
}
