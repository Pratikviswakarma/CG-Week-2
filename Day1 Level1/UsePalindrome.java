import java.util.Scanner; // Import the Scanner class for user input

// Class representing a Palindrome checker
class Palindrom {
    String text; // String to be checked for palindrome
    boolean isPalindrome = false; // Flag to indicate if the string is a palindrome

    // Constructor to initialize the Palindrom object with a text
    Palindrom(String text) {
        this.text = text; // Assign the input text to the class variable
    }

    // Method to check if the text is a palindrome
    public void check() {
        // Check if the text is equal to its reverse
        if (text.equals(new StringBuilder(text).reverse().toString())) {
            isPalindrome = true; // Set the flag to true if it's a palindrome
        }
    }

    // Method to display the result of the palindrome check
    public void display() {
        // Display appropriate message based on the isPalindrome flag
        if (isPalindrome) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }
}

// Main class to use the Palindrom class
public class UsePalindrome {

    // Main method where the program execution starts
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter a string for palindrome check
        System.out.println("Enter a string for palindrome check");
        String str = sc.nextLine(); // Read the input string

        // Create a Palindrom object with the inputted string
        Palindrom p = new Palindrom(str);

        // Call the check method to determine if the string is a palindrome
        p.check();

        // Call the display method to print the result
        p.display();

        // Close the Scanner object to release resources
        sc.close();
    }
}
