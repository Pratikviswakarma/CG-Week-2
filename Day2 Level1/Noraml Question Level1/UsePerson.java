import java.util.Scanner;

class Person {
    // Instance variables
    private String name;
    private int age;
    private String address;
    // Constructors
    public Person(){
        name = "Not set";
        age = 0;
        address = "Not set";
    }
    // Parameterized constructor
    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Copy constructor
    public Person(Person p){
        this.name=p.name;
        this.age=p.age;
        this.address=p.address;
    }
    // Display method
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }    
}

public class UsePerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the person: ");
        String name = sc.nextLine();
        System.out.println("Enter the age of the person: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the address of the person: ");
        String address = sc.nextLine();
        // Creating objects
        Person p1 = new Person(name, age, address);
        Person p2 = new Person(p1);
        // Displaying the details
        p1.display();
        p2.display();
        // Closing the scanner
        sc.close();
    }
}