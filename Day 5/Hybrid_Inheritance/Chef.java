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
public class Chef  extends Person implements Worker{
    public Chef(String name,int id){
        super(name, id);
    }
    public void performDuties(){
        System.out.println("Chef make dishes ");
    }
}
