package onlinemarketplace;

public class DiscountManager {
    // Generic method to apply discount on any product type
    public static <T extends Product> void applyDiscount(T product, double percentage) {
        double newPrice = product.getPrice() * (1 - percentage / 100);
        product.setPrice(newPrice);
        System.out.println("Discount applied! New price of " + product.getName() + ": $" + newPrice);
    }
}