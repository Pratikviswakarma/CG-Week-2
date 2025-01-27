package ecommerceplatform;

class Electronics extends Product implements Taxable {
    public Electronics(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount on electronics
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% tax on electronics
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax: 18%";
    }
}