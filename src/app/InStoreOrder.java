package app;

public class InStoreOrder implements Order {
    private int quantity;
    private double price;

    public InStoreOrder(int quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public double calculateTotalCost() {
        return quantity * price;
    }
}
