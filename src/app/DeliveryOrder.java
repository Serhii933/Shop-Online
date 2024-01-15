package app;

public class DeliveryOrder implements Order {
    private int quantity;
    private double price;
    private double deliveryCostPercentage;

    public DeliveryOrder(int quantity, double price, double deliveryCostPercentage) {
        this.quantity = quantity;
        this.price = price;
        this.deliveryCostPercentage = deliveryCostPercentage;
    }

    @Override
    public double calculateTotalCost() {
        double deliveryCost = price * (deliveryCostPercentage / 100);
        return quantity * price + deliveryCost;
    }
}
