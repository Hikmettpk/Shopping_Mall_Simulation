//Hikmet Topak 150121047
//In this homework, simulated a shopping mall using object-oriented programming

import java.util.*;
public class Test {
    public static void main(String[] args) {
        ShoppingMall shoppingMallObject = new ShoppingMall(); //Creating an object


        shoppingMallObject.addDairy(); //Using add function from every class
        shoppingMallObject.addFruit();
        shoppingMallObject.addTop();
        shoppingMallObject.addTrousers();
        shoppingMallObject.addUnderware();
        shoppingMallObject.addVegetable();


        shoppingMallObject.addArbitrary(new Top(100.0)); // add a custom Top object


        printContent(shoppingMallObject.getItems()); // print madeOf for Vegan items


        printWashingInstructions(shoppingMallObject.getItems()); // print howToWash for Washable items


        System.out.println("Total bill: $" + shoppingMallObject.bill()); // print the bill
    }

    public static void printContent(ArrayList<Item> items) { //If item which in a ArrayList instance of Vegan calling madeOf
        for (Item item : items) {
            if (item instanceof Vegan) {
                ((Vegan) item).madeOf();
            }
        }
    }

    public static void printWashingInstructions(ArrayList<Item> items) { //If item which in a ArrayList instance of Washable calling howToWash
        for (Item item : items) {
            if (item instanceof Washable) {
                ((Washable) item).howToWash();
            }
        }
    }
}