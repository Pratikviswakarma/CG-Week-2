// Product class
class Product {
    private String productName;
    private double price;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    // Get product name
    public String getProductName() {
        return productName;
    }

    // Get product price
    public double getPrice() {
        return price;
    }
}

// Order class
class Order {
    private String orderId;
    private Product[] products;
    private int productCount;

    // Constructor
    public Order(String orderId, int maxProducts) {
        this.orderId = orderId;
        this.products = new Product[maxProducts]; // Fixed-size array for products
        this.productCount = 0;
    }

    // Add a product to the order
    public void addProduct(Product product) {
        if (productCount < products.length) {
            products[productCount] = product;
            productCount++;
        } else {
            System.out.println("Cannot add more products to Order " + orderId);
        }
    }

    // Display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products:");
        double totalPrice = 0.0;
        for (int i = 0; i < productCount; i++) {
            Product product = products[i];
            System.out.println("- " + product.getProductName() + " ($" + product.getPrice() + ")");
            totalPrice += product.getPrice();
        }
        System.out.println("Total Price: $" + totalPrice);
    }
}

// Customer class
class Customer {
    private String name;
    private Order[] orders;
    private int orderCount;

    // Constructor
    public Customer(String name, int maxOrders) {
        this.name = name;
        this.orders = new Order[maxOrders]; // Fixed-size array for orders
        this.orderCount = 0;
    }

    // Place an order
    public void placeOrder(Order order) {
        if (orderCount < orders.length) {
            orders[orderCount] = order;
            orderCount++;
            System.out.println(name + " placed Order " + order.getOrderId());
        } else {
            System.out.println(name + " cannot place more orders.");
        }
    }

    // Display customer details
    public void displayCustomerDetails() {
        System.out.println("Customer: " + name);
        System.out.println("Orders:");
        for (int i = 0; i < orderCount; i++) {
            orders[i].displayOrderDetails();
            System.out.println();
        }
    }

    // Get customer name
    public String getName() {
        return name;
    }
}

// Main class to demonstrate relationships and communication
public class  UseEcommerce {
   
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Laptop", 1200.50);
        Product product2 = new Product("Smartphone", 799.99);
        Product product3 = new Product("Headphones", 199.99);
        Product product4 = new Product("Keyboard", 49.99);

        // Create orders
        Order order1 = new Order("O1001", 3);
        Order order2 = new Order("O1002", 2);

        // Add products to orders
        order1.addProduct(product1);
        order1.addProduct(product2);
        order2.addProduct(product3);
        order2.addProduct(product4);

        // Create a customer
        Customer customer = new Customer("Alice", 5);

        // Customer places orders
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        System.out.println();

        // Display customer details along with their orders and products
        customer.displayCustomerDetails();
    }
}
