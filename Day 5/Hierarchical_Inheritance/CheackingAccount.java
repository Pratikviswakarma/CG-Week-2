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
public class CheackingAccount extends BankAccount {
    private String checkingAccount="Cheacking Account ";
    private double withdrawalLimit=100000.00;
    public CheackingAccount(int accountNumber,double balance){
        super(accountNumber, balance);
    }
    public void displayAccountType(){
        System.out.println("This is from "+checkingAccount);
    }
}