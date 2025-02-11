package warehousemanagement;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem>{
    // List to store items of type T
   private List<T> items = new ArrayList<>();

    // Method to add an item to the storage
    public void addItems(T item){
        items.add(item);
    }

    // Method to retrieve all stored items
    public List<T> getItems(){
        return items;
    }

    // Method to display items of storage
    public static void displayAllItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }

}
