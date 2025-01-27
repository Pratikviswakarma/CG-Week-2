package onlinefooddeliverysystem;

public class UseFoodItem {
    public static void processOrder(FoodItem foodItem) {
        System.out.println(foodItem.getItemDetails());
        double totalPrice = foodItem.calculateTotalPrice();
        if (foodItem instanceof Discountable) {
            Discountable discountable = (Discountable) foodItem;
            System.out.println(discountable.getDiscountDetails());
            totalPrice = discountable.applyDiscount(totalPrice);
        }
        System.out.println("Final Price: " + totalPrice + "\n");
    }

    public static void main(String[] args) {
        FoodItem vegItem = new VegItem("Paneer Tikka", 200.0, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Biryani", 300.0, 1);

        System.out.println("Processing Order:");
        processOrder(vegItem);
        processOrder(nonVegItem);
    }
}
