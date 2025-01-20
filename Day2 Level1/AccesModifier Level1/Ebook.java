import java.util.Scanner;

class Book{
    public int ISBN;
    protected String title;
    private String author;

    public Book(){
        ISBN=12456375;
        title="Unknown";
        author="Unkown";
    }

    public Book(int ISBN,String title){
        this.ISBN=ISBN;
        this.title=title;
    }

    public void setAuthor(String author){
        this.author=author;
    }

    public String getAuthor(){
        return author;
    }

}

public class Ebook {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ISBN ");
        int ISBN=sc.nextInt();
        System.out.println("Enter book title ");
        String title=sc.next();
        System.out.println("Enter author name ");
        String author=sc.next();

        Book eb=new Book(ISBN,title);
        System.out.println("Set Author name ");
        eb.setAuthor(author);
        System.out.println("This is form get method ");
        String getAuthor=eb.getAuthor();
        System.out.println("Acces direct public memeber "+ISBN+" and this is protected "+title);

        sc.close();

        

    }
}
