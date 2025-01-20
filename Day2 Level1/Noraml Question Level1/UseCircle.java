import java.util.Scanner;

class Circle{
    // Instance variables
    private double radius;
    private double area;

    // Constructors
    public Circle(){
        radius = 5.0;
    }
    public Circle(double radius){
        this();
        this.radius = radius;
    }
    // Method to calculate the area
    public void calculateArea(){
        area = Math.PI * radius * radius;
    }
    // Method to display the details
    public void display(){
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
    }
}


public class UseCircle {
    public static void main(String[] args) {
        // Creating a scanner object
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        // Reading the radius from the user
        double radius = sc.nextDouble();
        // Creating objects
        Circle c1 = new Circle();
        Circle c2 = new Circle(radius);
        // Calculating the area
        c1.calculateArea();
        c2.calculateArea();
        // Displaying the details
        c1.display();
        c2.display();
        // Closing the scanner
        sc.close();
    }
}
