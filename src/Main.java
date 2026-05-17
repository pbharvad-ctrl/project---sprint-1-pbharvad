import payment.*;
import observer.*;

public class Main {

    public static void main(String[] args) {

        // Strategy Pattern
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment());
        context.executePayment(25.99);

        // Observer Pattern
        OrderManager manager = new OrderManager();
        KitchenStaff kitchen = new KitchenStaff();

        manager.registerObserver(kitchen);
        manager.placeOrder("Burger with extra cheese");
    }
}
