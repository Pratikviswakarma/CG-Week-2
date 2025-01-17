import java.util.Scanner; // Import the Scanner class for user input

// Class representing a Bank Account with attributes for name, account number, and balance
class BankAccount {
    private String name;         // Name of the account holder
    private int accountNumber;   // Account number of the account holder
    private double balance;      // Balance in the bank account

    // Constructor to initialize the BankAccount object with name, account number, and balance
    public BankAccount(String name, int accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit an amount to the bank account
    public void deposit(double amount) {
        balance += amount; // Increase the balance by the deposit amount
    }

    // Method to withdraw an amount from the bank account
    public void withdraw(double amount) {
        // Check if there is enough balance to withdraw the amount
        if (balance >= amount) {
            balance -= amount; // Deduct the amount from the balance
        } else {
            System.out.println("Insufficient balance"); // Display error message if balance is insufficient
        }
    }

    // Method to get the current balance of the bank account
    public double getBalance() {
        return balance; // Return the current balance
    }

    // Method to display the details of the bank account
    public void display() {
        System.out.println("Name: " + name);                 // Print the name of the account holder
        System.out.println("Account Number: " + accountNumber); // Print the account number
        System.out.println("Balance: " + balance);           // Print the current balance
    }
}

// Main class to use the BankAccount class
public class UseBankAccount {
    
    // Main method where the program execution starts
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for user input

        // Prompt the user to enter the bank account details
        System.out.println("Enter account holder name, account number and balance");
        
        // Read the account holder's name
        System.out.println("Enter name");
        String name = sc.nextLine();
        
        // Read the account number
        System.out.println("Enter account number");
        int accountNumber = sc.nextInt();
        
        // Read the initial balance
        System.out.println("Enter balance");
        double balance = sc.nextDouble();
        
        // Create a BankAccount object with the inputted details
        BankAccount account = new BankAccount(name, accountNumber, balance);
        
        // Prompt and read the amount to deposit into the account
        System.out.println("Enter amount to deposit");
        account.deposit(sc.nextDouble());
        
        // Prompt and read the amount to withdraw from the account
        System.out.println("Enter amount to withdraw");
        account.withdraw(sc.nextDouble());
        
        // Display the updated account details
        account.display();
        
        // Close the Scanner object to release resources
        sc.close();
    }
}
