/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Single_Inheritance;

/**
 *
 * @author HP
 */
public class Author extends Book{
    private String name="Belond Swith";
    private String bio="Basic to advance";

    public Author(String title,String publicationYear){
        super(title,publicationYear);
    }
    public void dispalyInfo(){
        System.out.println("Book title is "+title);
        System.out.println("Book PublicationYear is "+publicationYear);
        System.out.println("Author name is "+name);
        System.out.println("Book biography is "+bio);
    }
}