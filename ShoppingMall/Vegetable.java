//Hikmet Topak 150121047

public class Vegetable extends Food implements Vegan, Washable {

    public Vegetable() {//Setting BasePrice
        super();
        setBasePrice(10.0);
    }

    public Vegetable(double basePrice) {
        super();
        setBasePrice(basePrice);
    }

    @Override
    public double calculatePrice() {//calculating price
        double taxedPrice = getBasePrice() * (1 + getVat());
        return taxedPrice * 1.25; // adding 25% profit
    }

    @Override
    public void howToWash() {//printing howToWash method
        System.out.println("Wash Vegetable with warm water.");
    }

    @Override
    public void madeOf() {//printing madeOf method
        System.out.println("It is made only of vegetables.");
    }
}
