package onlinemarketplace;

public class OnlineMarketPlace {
    public static void main(String[] args) {
        // Creating catalogs for different product categories
        Catalog<Book> bookCatalog = new Catalog<>();
        bookCatalog.addProduct(new Book("Java Programming", 50));
        bookCatalog.addProduct(new Book("Data Structures", 60));

        Catalog<Clothing> clothingCatalog = new Catalog<>();
        clothingCatalog.addProduct(new Clothing("T-Shirt", 20));
        clothingCatalog.addProduct(new Clothing("Jeans", 40));

        Catalog<Gadget> gadgetCatalog = new Catalog<>();
        gadgetCatalog.addProduct(new Gadget("Smartphone", 700));
        gadgetCatalog.addProduct(new Gadget("Laptop", 1200));

        // Display all products in each catalog
        bookCatalog.displayProducts();
        clothingCatalog.displayProducts();
        gadgetCatalog.displayProducts();

        // Applying discounts dynamically
        System.out.println("\nApplying Discounts:");
        DiscountManager.applyDiscount(bookCatalog.getProducts().get(0), 10);  // 10% discount on Java Book
        DiscountManager.applyDiscount(clothingCatalog.getProducts().get(1), 15); // 15% discount on Jeans
        DiscountManager.applyDiscount(gadgetCatalog.getProducts().get(0), 5); // 5% discount on Smartphone

        // Display catalogs after applying discounts
        System.out.println("\nUpdated Product Prices:");
        bookCatalog.displayProducts();
        clothingCatalog.displayProducts();
        gadgetCatalog.displayProducts();
    }
}
