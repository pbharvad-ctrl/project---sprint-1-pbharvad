package observer;

public class CustomerNotification implements Observer {

    @Override
    public void update(String orderStatus) {
        System.out.println("Customer Notification: Your order status is now: " + orderStatus);
    }
}
