/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assisted_Problems;

/**
 *
 * @author HP
 */
public class Manager extends Employee{
    private int teamSize=4;
    public Manager(String name,int id,double salary){
       super(name, id, salary);
    }
    public void dispalyDeatails(){
        System.out.println("Manager Name is "+name);
        System.out.println("Manager Id is "+id);
        System.out.println("Manager Salary is "+salary);
        System.out.println("Team size is "+teamSize);
    }
}
