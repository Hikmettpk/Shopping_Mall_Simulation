//Hikmet Topak 150121047

import java.util.ArrayList;

public class ShoppingMall {
    private ArrayList<Item> items; //Creating an ArrayList

    public ShoppingMall() {
        items = new ArrayList<Item>();
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addDairy() { //Adding item from Dairy to ArrayList
        items.add(new Dairy());
    }

    public void addFruit() { //Adding item from Fruit to ArrayList
        items.add(new Fruit());
    }

    public void addTop() { //Adding item from Top to ArrayList
        items.add(new Top());
    }

    public void addTrousers() { //Adding item from Trouser to ArrayList
        items.add(new Trousers());
    }

    public void addUnderware() { //Adding item from Underware to ArrayList
        items.add(new Underware());
    }

    public void addVegetable() { //Adding item from Vegetable to ArrayList
        items.add(new Vegetable());
    }

    public void addArbitrary(Item item) { //Adding item to ArrayList
        items.add(item);
    }

    public double bill() { //Calculating Bill
        double total = 0.0;
        for (Item item : items) {
            total += item.calculatePrice();
        }
        return total;
    }
}
