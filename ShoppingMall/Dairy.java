//Hikmet Topak 150121047

public class Dairy extends Food {

    public Dairy() {
        this(8.0);
    }

    public Dairy(double basePrice) {
        super();
        setBasePrice(basePrice);
    }

    @Override
    public double calculatePrice() { //Calculating price and this is a Override
        double taxedPrice = getBasePrice() * (1 + getVat());
        double retailPrice = taxedPrice * 1.3;
        return retailPrice;
    }
}
