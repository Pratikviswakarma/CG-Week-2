// Bank class
class Bank {
    private String bankName;

    // Constructor
    public Bank(String bankName) {
        this.bankName = bankName;
    }

    // Open an account for a customer
    public Account openAccount(Customer customer, double initialBalance) {
        Account newAccount = new Account(this, customer, initialBalance);
        customer.addAccount(newAccount);
        System.out.println("Account opened for " + customer.getName() + " at " + bankName + " with initial balance: " + initialBalance);
        return newAccount;
    }

    // Get bank name
    public String getBankName() {
        return bankName;
    }
}

// Customer class
class Customer {
    private String name;
    private Account[] accounts;
    private int accountCount;

    // Constructor
    public Customer(String name, int maxAccounts) {
        this.name = name;
        this.accounts = new Account[maxAccounts]; // Fixed number of accounts
        this.accountCount = 0;
    }

    // Add an account to the customer
    public void addAccount(Account account) {
        if (accountCount < accounts.length) {
            accounts[accountCount] = account;
            accountCount++;
        } else {
            System.out.println("Cannot add more accounts for " + name);
        }
    }

    // View all account balances
    public void viewBalances() {
        System.out.println("Customer: " + name + "'s Account Balances:");
        for (int i = 0; i < accountCount; i++) {
            accounts[i].displayAccountInfo();
        }
    }

    // Get customer name
    public String getName() {
        return name;
    }
}

// Account class
class Account {
    private Bank bank;
    private Customer customer;
    private double balance;

    // Constructor
    public Account(Bank bank, Customer customer, double initialBalance) {
        this.bank = bank;
        this.customer = customer;
        this.balance = initialBalance;
    }

    // Display account information
    public void displayAccountInfo() {
        System.out.println("Bank: " + bank.getBankName() + ", Balance: " + balance);
    }

    // Deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " to account at " + bank.getBankName());
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from account at " + bank.getBankName());
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}

// Main class to demonstrate association
public class UseBank {
    public static void main(String[] args) {
        // Create a bank
        Bank bank = new Bank("Global Bank");

        // Create customers
        Customer customer1 = new Customer("Alice", 2); // Max 2 accounts
        Customer customer2 = new Customer("Bob", 1);   // Max 1 account

        // Open accounts
        Account account1 = bank.openAccount(customer1, 1000.0);
        Account account2 = bank.openAccount(customer1, 2000.0);
        Account account3 = bank.openAccount(customer2, 500.0);

        // Perform transactions
        account1.deposit(500.0);
        account2.withdraw(1000.0);
        account3.deposit(300.0);

        // View balances
        customer1.viewBalances();
        customer2.viewBalances();
    }
}
