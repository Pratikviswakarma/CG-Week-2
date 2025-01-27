package ecommerceplatform;

abstract class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) this.price = price;
    }

    public String getProductDetails() {
        return "Product ID: " + productId + ", Name: " + name + ", Price: " + price;
    }

    public abstract double calculateDiscount();
}