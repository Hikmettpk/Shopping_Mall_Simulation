public class Trousers extends Clothing{

    @Override
    public double calculatePrice(){ //Caltulating price
        double taxedPrice = getBasePrice() * (1 + getVat());
        double retailPrice = taxedPrice * 1.2;
        return retailPrice;
    }

    @Override
    public void howToWash(){
        System.out.println("“Wash Trousers at 30 degrees.");
    }//Printing howToWash method

    public Trousers() {//Setting BasePrice for Trousers
        super();
        setBasePrice(40.0);
    }

    public Trousers(double basePrice) {
        super();
        setBasePrice(basePrice);
    }
}
