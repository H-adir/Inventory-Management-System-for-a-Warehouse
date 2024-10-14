package inventory;

public class electronics extends product {
     String brand;
     int warranty; // in years

    public electronics(String name, double price, int quantity, String brand, int warranty) {
        super(name, price, quantity);
        this.brand = brand;
        this.warranty = warranty;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand: " + brand);
        System.out.println("Warranty: " + warranty);
    }
}
