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
public class Developer extends Employee {
    private String programmingLanguage="Java, C++ , C";
    public Developer(String name,int id,double salary){
        super(name, id, salary);
    }
    public void dispalyDeatails(){
        System.out.println("Developer Name is "+name);
        System.out.println("Developer Id is "+id);
        System.out.println("Developer Salary is "+salary);
        System.out.println("Programming Language "+programmingLanguage);
    }
}
