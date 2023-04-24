//Hikmet Topak 150121047
//Clothing class extends from Item class and implement from washable

public abstract class Clothing extends Item implements Washable {

    public Clothing() {
        setVat(0.18);
    } //Chancing the Vat
}
