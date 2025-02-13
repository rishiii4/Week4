package implementshoppingcart;

import java.util.HashMap;

public class ShoppingCart {
    public static void main(String[] args) {

        // creating cart
        Cart cart = new Cart();

        // adding items into cart
        cart.addItem( new Item("Mobile", 10000));
        cart.addItem( new Item("Cover", 200));
        cart.addItem( new Item("Laptop", 100000));
        cart.addItem( new Item("Charger", 1000));

        // displaying items
        System.out.println("Displaying items :-");
        cart.displayItem();

        // displaying items by order of insertion
        System.out.println("Displaying items by order of insertion :-");
        cart.displayItemByOrder();

        // displaying items by price
        System.out.println("Displaying items by price :-");
        cart.displayItemByPrice();

    }
}

