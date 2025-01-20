import java.util.Scanner;

class BankAccount {
    private static String bankName;
    public final long accountNumber;
    protected String accountHolder;
    private double balance;
    private static int noOfAccount;

    // Constructor
    public BankAccount(String bankName,long accountNumber, String accountHolder,double initialBalance) {
        this.bankName=bankName;
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        noOfAccount++;
    }

    public static int getTotalAccounts(){
        return noOfAccount;
    }

    // Method to get the balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public void displayAccountDetails(){
        System.out.println("Bank Name is "+bankName);
        System.out.println("Account number is "+accountNumber);
        System.out.println("Account holder is "+accountHolder);
        System.out.println("Your initial balance is "+balance);
        System.out.println("Total number of accounts in this bank "+getTotalAccounts());
    }
}
public class UseBankAccount{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Bank name that can't changed once it assign ");
        String bankName=sc.nextLine();
        System.out.println("Enter Account Number ");
        long accountNum=sc.nextLong();
        System.out.println("Enter Bank account holder name ");
        String accountHolder=sc.next();
        System.out.println("Enter balance");
        double balance=sc.nextDouble();
        BankAccount account = new BankAccount(bankName,accountNum,accountHolder,balance);

        if(account instanceof BankAccount){
            System.out.println("This is belong to Bankaccount class");
        }
        
        // Display account details
        account.displayAccountDetails();
        
        // Deposit and withdraw operations
        account.deposit(500.0);
        account.withdraw(200.0);
        
        // Display updated details
        account.displayAccountDetails();

        sc.close();
    }
}


