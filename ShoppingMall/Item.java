//Hikmet Topak 150121047

public abstract class Item {
    private double vat; //Creating necessary variables
    private double basePrice;

    public double getVat() { //Lines 7-21 : Getters and setters
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public abstract double calculatePrice(); //Creating an abstract method
}
