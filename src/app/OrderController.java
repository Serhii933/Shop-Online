package app;

public class OrderController {
    private Order order;

    public void createInStoreOrder(int quantity, double price) {
        order = new InStoreOrder(quantity, price);
    }

    public void createDeliveryOrder(int quantity, double price, double deliveryCostPercentage) {
        order = new DeliveryOrder(quantity, price, deliveryCostPercentage);
    }

    public double calculateTotalCost() {
        return order.calculateTotalCost();
    }
}