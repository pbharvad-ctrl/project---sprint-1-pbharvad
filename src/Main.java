import payment.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World");

        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment());
        context.executePayment(25.99);
    }
}
