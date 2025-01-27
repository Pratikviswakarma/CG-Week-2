package onlinefooddeliverysystem;

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount(double totalPrice) {
        return totalPrice * 0.9; // 10% discount for veg items
    }

    @Override
    public String getDiscountDetails() {
        return "10% discount applied for Veg items.";
    }
}
