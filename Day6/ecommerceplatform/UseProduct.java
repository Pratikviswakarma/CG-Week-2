package ecommerceplatform;
import java.util.ArrayList;
import java.util.List;

public class UseProduct {
    public static void displayFinalPrice(List<Product> products) {
        for (Product product : products) {
            System.out.println(product.getProductDetails());
            double discount = product.calculateDiscount();
            double tax = (product instanceof Taxable) ? ((Taxable) product).calculateTax() : 0.0;
            double finalPrice = product.getPrice() + tax - discount;

            System.out.println("Discount: " + discount);
            if (product instanceof Taxable) {
                System.out.println(((Taxable) product).getTaxDetails());
            }
            System.out.println("Final Price: " + finalPrice + "\n");
        }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Electronics("E001", "Smartphone", 50000.0));
        products.add(new Clothing("C001", "Jeans", 2000.0));
        products.add(new Groceries("G001", "Rice (5kg)", 300.0));

        System.out.println("Final Prices for Products:");
        displayFinalPrice(products);
    }
}
