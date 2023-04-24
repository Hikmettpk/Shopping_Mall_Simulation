//Hikmet Topak 150121047

public class Underware extends Clothing {

    public Underware() {
        this(30.0);
    }

    public Underware(double basePrice) {//Setting BasePrice for Underware
        super();
        setBasePrice(basePrice);
    }

    @Override
    public double calculatePrice() {//Calculating Price
        double taxedPrice = this.getBasePrice() * 1.18;
        return taxedPrice * 1.45;
    }

    @Override
    public void howToWash() {
        System.out.println("Wash Underware at 60 degrees.");
    }//Printing howToWash method
}
