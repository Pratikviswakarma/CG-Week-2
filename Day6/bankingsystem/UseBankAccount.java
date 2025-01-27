package bankingsystem;

public class UseBankAccount {
    public static void main(String[] args) {
        BankAccount ca=new CurrentAccount(101, "Pratik", 400000.00);
        Loanable cain=new CurrentAccount(101, "Pratik", 400000.00);
        ca.deposit(5000.00);
        ca.withdraw(200.00);
        ca.calculateInterest();
        cain.calculateLoanEligibility();
        cain.applyForLoan();
        ca.display();
        BankAccount sa=new SavingsAccount(102, "Sudeep", 450000.00);
        Loanable sain=new SavingsAccount(102, "Sudeep", 450000.00);
        sa.deposit(5000.00);
        sa.withdraw(200.00);
        sa.calculateInterest();
        sain.calculateLoanEligibility();
        sain.applyForLoan();
        sa.display();
    }
}