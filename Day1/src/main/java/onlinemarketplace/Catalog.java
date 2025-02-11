package onlinemarketplace;

import java.util.ArrayList;
import java.util.List;

public class Catalog<T extends Product> {
    private List<T> products = new ArrayList<>();

    // Method to add product
    public void addProduct(T product) {
        products.add(product);
    }

    // Method to get products
    public List<T> getProducts() {
        return products;
    }

    // Method to display products
    public void displayProducts() {
        System.out.println("Product Catalog:");
        for (T product : products) {
            System.out.println(product);
        }
    }
}
