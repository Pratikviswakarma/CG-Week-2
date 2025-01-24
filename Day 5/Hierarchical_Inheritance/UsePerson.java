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
public class UsePerson {
  public static void main(String[] args) {
    Person th=new Teacher("Vaisu", 18);
    th.displayRole();
    Person st=new Student("Pratik", 20);
    st.displayRole();
    Person sf=new Staff("xyz", 15);
    sf.displayRole();
  }
}
