import java.util.Scanner; // Import the Scanner class for user input

// Class representing a Movie Ticket
class MovieTicket {
    private String movieName; // Name of the movie
    private String seatNumber; // Seat number for the booking
    private int price; // Price of the ticket

    // Constructor to initialize the MovieTicket object with movie name, seat number, and price
    public MovieTicket(String movieName, String seatNumber, int price) {
        this.movieName = movieName; // Assign the movie name to the class variable
        this.seatNumber = seatNumber; // Assign the seat number to the class variable
        this.price = price; // Assign the price to the class variable
    }

    // Method to simulate ticket booking and display ticket details
    public void bookTicket() {
        // Generate a random ticket number using the price as a multiplier for variability
        System.out.println("Ticket Number: " + Math.random() * price);
        System.out.println("Seat Number: " + seatNumber); // Display the seat number
        System.out.println("Price: " + price); // Display the ticket price
    }

    // Method to display the movie name and call the bookTicket method
    public void display() {
        System.out.println("Movie Name: " + movieName); // Display the movie name
        bookTicket(); // Call the bookTicket method to display ticket details
    }
}

// Main class to use the MovieTicket class
public class UseMovieTicket {
    
    // Main method where program execution starts
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input
        
        // Prompt the user to enter movie details
        System.out.println("Enter movie name, seat number, and price ");
        System.out.println("Enter movie name:");
        String movieName = sc.nextLine(); // Read the movie name

        System.out.println("Enter seat number:");
        String seatNumber = sc.nextLine(); // Read the seat number

        System.out.println("Enter price:");
        int price = sc.nextInt(); // Read the price of the ticket

        // Create a MovieTicket object with the entered details
        MovieTicket ticket = new MovieTicket(movieName, seatNumber, price);

        // Call the bookTicket method to display the ticket booking details
        ticket.bookTicket();

        // Call the display method to show the movie name and ticket details
        ticket.display();

        sc.close(); // Close the Scanner object to release resources
    }
}
