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
public class BankAccount{
    private int accountNumber;
    private double balance;
    public BankAccount(int accountNumber,double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void displayAccountType(){
        System.out.println("This is Bank Account ");
    }
}
