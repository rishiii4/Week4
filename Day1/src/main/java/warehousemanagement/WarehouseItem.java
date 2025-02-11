package warehousemanagement;

abstract class WarehouseItem {
    private String name;
    private int price;

    WarehouseItem(String name, int price){
        this.name = name;
        this.price = price;
    }

    // Method to get name
    public String getName() {
        return name;
    }

    // Method to get price
    public int getPrice() {
        return price;
    }
    public String toString() {
        return name + " - " + price + " INR";
    }
}
