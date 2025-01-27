package onlinefooddeliverysystem;

class NonVegItem extends FoodItem implements Discountable {
    private static final double ADDITIONAL_CHARGE = 20.0; // Example additional charge

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() + ADDITIONAL_CHARGE) * getQuantity();
    }

    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice * 0.95; // 5% discount for non-veg items
    }

    @Override
    public String getDiscountDetails() {
        return "5% discount applied for Non-Veg items.";
    }
}
