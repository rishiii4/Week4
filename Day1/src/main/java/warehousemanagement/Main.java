package warehousemanagement;

public class Main {
    public static void main(String[] args) {

        // Storage for Groceries
        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItems(new Groceries("Milk", 40));  // Adding Milk
        groceriesStorage.addItems(new Groceries("Shampoo", 10)); // Adding Shampoo

        // Storage for Electronics
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItems(new Electronics("LED TV", 40000));  // Adding LED TV
        electronicsStorage.addItems(new Electronics("Fan", 1500));  // Adding Fan

        // Storage for Furniture
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItems(new Furniture("Sofa", 20000));  // Adding Sofa
        furnitureStorage.addItems(new Furniture("Bed", 15000));  // Adding Bed

        // Display all items from each category using the generic displayAllItems method
        System.out.println("Electronics Storage:");
        Storage.displayAllItems(electronicsStorage.getItems());

        System.out.println("\nGroceries Storage:");
        Storage.displayAllItems(groceriesStorage.getItems());

        System.out.println("\nFurniture Storage:");
        Storage.displayAllItems(furnitureStorage.getItems());

    }
}