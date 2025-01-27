package bankingsystem;

abstract class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber,String holderName,double balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }

    public void display() {
        System.out.println("Account Number is "+accountNumber);
        System.out.println("Holder name is "+holderName);
        System.out.println("Balance is "+balance);
    }

    public void deposit(double amount){
        if(amount>0){
            balance=balance+amount;
        }
        else{
            System.out.println("Invalid ammount ");
        }
    }

    public void withdraw(double amount){
        if(amount<=balance && amount>0){
            balance=balance-amount;
        }else{
            System.out.println("Invalid amount ");
        }
    }
    abstract public double calculateInterest();

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}