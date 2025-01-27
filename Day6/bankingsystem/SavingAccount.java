package bankingsystem;

class SavingsAccount extends BankAccount implements Loanable{
    private double interest=5.75;
    public SavingsAccount(int accountNumber,String holderName,double balance){
        super(accountNumber,holderName,balance);
    }
    public void applyForLoan(){
        System.out.println("Applied for loan");
    }
    public void calculateLoanEligibility(){
        if(getBalance()>=5000){
            System.out.println("Eligible for Loan ");
        }
        else{
            System.out.println("Not Eligible apply for loan");
        }
    }
    public double calculateInterest(){
        return interest;
    }
    public void setInterest(double interest){
        this.interest=interest;
    }
    public double getInterest(){
        return interest;
    }

}