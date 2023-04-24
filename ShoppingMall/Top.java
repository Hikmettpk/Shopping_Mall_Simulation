//Hikmet Topak 150121047

public class Top extends Clothing {

    public Top() { //Setting Base Price
        super();
        setBasePrice(20.0);
    }

    public Top(double basePrice) {
        super();
        setBasePrice(basePrice);
    }

    @Override
    public double calculatePrice() { //Calculating Price
        double taxedPrice = getBasePrice() * (1 + getVat());
        return taxedPrice * 1.2;
    }

    @Override
    public void howToWash() { //Printing howToWash
        System.out.println("Wash Top at 40 degrees.");
    }
}
