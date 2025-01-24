/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hierarchical_Inheritance;

/**
 *
 * @author HP
 */
public class SavingAccount extends BankAccount{
    private String savingAccount="Saving Account ";
    private double interestRate;
    public SavingAccount(int accountNumber,double balance){
        super(accountNumber,balance);
    }
    public void displayAccountType(){
        System.out.println("This is from "+savingAccount);
    }
}
