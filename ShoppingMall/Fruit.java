//Hikmet Topak 150121047
//This class extend from Food and implement from vegan and washable

public class Fruit extends Food implements Vegan, Washable {

    public Fruit() {
        this(6.0);
    }

    public Fruit(double basePrice) {
        super();
        setBasePrice(basePrice);
    }

    @Override
    public double calculatePrice() { //Calculating Price
        double taxedPrice = getBasePrice() + (getBasePrice() * getVat());
        return taxedPrice + (taxedPrice * 0.20);
    }

    @Override
    public void howToWash() {
        System.out.println("Wash Fruit with cold water.");
    } //Printing hotToWash

    @Override
    public void madeOf() {
        System.out.println("It is made only of fruits.");
    } //Printing madeOf
}