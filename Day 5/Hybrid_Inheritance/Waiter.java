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
public class Waiter extends Person implements Worker{
    public Waiter(String name,int id){
        super(name, id);
    }
    public void performDuties(){
        System.out.println("Waiter savers dishes ");
    }
} 