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
class Book{
 protected String title;
 protected String publicationYear;
 
    public Book(String title,String publicationYear){
        this.title=title;
        this.publicationYear=publicationYear;
    }
    public void dispalyInfo(){
        System.out.println("Book title is "+title);
        System.out.println("Book PublicationYear is "+publicationYear);
    }
}
