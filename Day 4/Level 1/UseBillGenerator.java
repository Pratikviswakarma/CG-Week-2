// Product class
class Product {
    private String name;
    private double quantity; // Quantity in kg or liters
    private double pricePerUnit; // Price per unit (kg or liter)

    // Constructor
    public Product(String name, double quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    // Get product name
    public String getName() {
        return name;
    }

    // Get total price for the product
    public double getTotalPrice() {
        return quantity * pricePerUnit;
    }

    // Get product quantity
    public double getQuantity() {
        return quantity;
    }

    // Get price per unit
    public double getPricePerUnit() {
        return pricePerUnit;
    }
}

// BillGenerator class
class BillGenerator {
    // Calculate the total bill for the customer
    public static double calculateTotalBill(Customer customer) {
        double totalBill = 0.0;
        int numberOfProducts = customer.getProductCount();

        for (int i = 0; i < numberOfProducts; i++) {
            totalBill += customer.getProduct(i).getTotalPrice();
        }

        return totalBill;
    }
}

// Customer class
class Customer {
    private String name;
    private Product[] products;
    private int productCount;

    // Constructor
    public Customer(String name, int maxProducts) {
        this.name = name;
        this.products = new Product[maxProducts];
        this.productCount = 0;
    }

    // Get customer name
    public String getName() {
        return name;
    }

    // Add product to the customer's cart
    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount] = product;
            productCount++;
        } else {
            System.out.println("Cannot add more products to the cart.");
        }
    }

    // Get product count
    public int getProductCount() {
        return productCount;
    }

    // Get a specific product from the cart
    public Product getProduct(int index) {
        if (index < productCount) {
            return products[index];
        }
        return null;
    }

    // Display products in the cart
    public void displayCart() {
        System.out.println("Products in the cart for " + name + ":");
        for (int i = 0; i < productCount; i++) {
            Product product = products[i];
            System.out.println("- " + product.getName() + ": " + product.getQuantity() + " at $"
                    + product.getPricePerUnit() + " per unit. Total: $" + product.getTotalPrice());
        }
    }
}

// Main class to demonstrate the scenario
public class UseBillGenerator {
    public static void main(String[] args) {
        // Create customer
        Customer customer = new Customer("Alice", 5);

        // Create products
        Product apples = new Product("Apples", 2.0, 3.0); // 2 kg at $3 per kg
        Product milk = new Product("Milk", 1.0, 2.0); // 1 liter at $2 per liter

        // Add products to the customer's cart
        customer.addProduct(apples);
        customer.addProduct(milk);

        // Display products in the cart
        customer.displayCart();

        // Calculate and display the total bill
        double totalBill = BillGenerator.calculateTotalBill(customer);
        System.out.println("Total Bill for " + customer.getName() + ": $" + totalBill);
    }
}
