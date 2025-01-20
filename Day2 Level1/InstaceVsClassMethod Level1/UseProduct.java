import java.util.Scanner;

class Product {
    // Instance variables
      private String productName;
      private double price;
    // Static variable
      private static int totalProducts = 0;
    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }
    // Instance methods
    public void displayProductDeatils() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

}

public class UseProduct{
public static void main(String[] args) {
    // Create Scanner object
    Scanner sc = new Scanner(System.in);
    // Read input
    System.out.println("Enter the Product name: ");
    String productName = sc.next();
    System.out.println("Enter the Price: ");
    double price = sc.nextDouble();
    // Create Product object    
    Product product = new Product(productName, price);
    Product product2 = new Product(productName, price);
    // Call instance methods
    product.displayProductDeatils();
    product2.displayProductDeatils();
    Product.displayTotalProducts();
    Product.displayTotalProducts();
    // Close Scanner
    sc.close();
}
}