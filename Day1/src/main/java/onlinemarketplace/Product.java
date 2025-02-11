package onlinemarketplace;

// Abstract class for Products
abstract class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Method to get name
    public String getName() { return name; }

    // Method to get price
    public double getPrice() { return price; }

    // Method to set price
    public void setPrice(double price) { this.price = price; }

    @Override
    public String toString() {
        return name + " - " + price + " INR";
    }
}
