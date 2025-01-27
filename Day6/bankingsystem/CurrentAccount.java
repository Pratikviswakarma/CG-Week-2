package bankingsystem;

class CurrentAccount extends BankAccount implements Loanable{
    private double interest=9.5;
    public CurrentAccount(int accountNumber,String holderName,double balance){
        super(accountNumber,holderName,balance);
    }
    public void applyForLoan(){
        System.out.println("Applied for loan");
    }
    public void calculateLoanEligibility(){
        if(getBalance()>0){
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
