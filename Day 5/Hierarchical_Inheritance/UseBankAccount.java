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
public class UseBankAccount {
    public static void main(String[] args) {
        BankAccount sa=new SavingAccount(10124500,45000.23);
        sa.displayAccountType();
        BankAccount ca=new CheackingAccount(10124500,45000.23);
        ca.displayAccountType();
        BankAccount fa=new FixedDepositAccount(10124500,45000.23);
        fa.displayAccountType();
    }
}
