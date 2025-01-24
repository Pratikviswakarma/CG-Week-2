/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hybrid_Inheritance;

/**
 *
 * @author HP
 */
public class UsePerson {
    public static void main(String[] args) {
        Worker chef=new Chef("Amit", 101);
        chef.performDuties();
        Worker waiter=new Waiter("Sumit", 102);
        waiter.performDuties();
    }
}
