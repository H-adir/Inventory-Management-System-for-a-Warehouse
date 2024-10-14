package inventory;

public class food extends product {
     String expirationDate;

    public food(String name, double price, int quantity, String expirationDate) {
        super(name, price, quantity);
        this.expirationDate = expirationDate;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Expiration Date: " + expirationDate);
    }
}
