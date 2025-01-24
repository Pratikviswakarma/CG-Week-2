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
public class FixedDepositAccount extends BankAccount{
    private double fixedDeposite=450000.00;
    private String fixedAccount="Fixed Account ";
    public FixedDepositAccount(int accountNumber,double balance){
        super(accountNumber, balance);
    }
    public void displayAccountType(){
        System.out.println("This is from "+fixedAccount);
    }
}
