package app;

public class Main {
    public static void main(String[] args) {
        OrderController controller = new OrderController();
        OrderView view = new OrderView();


        controller.createInStoreOrder(3, 25.0);
        double totalCost1 = controller.calculateTotalCost();
        view.displayTotalCost(totalCost1);


        controller.createDeliveryOrder(2, 30.0, 5.0);
        double totalCost2 = controller.calculateTotalCost();
        view.displayTotalCost(totalCost2);
    }
}