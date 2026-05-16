public class OnlinePayment implements PaymentStrategy {

    @Override
    public void processPayment(double amount) {
        System.out.println("Paid $" + amount + " using Online Payment.");
    }
}
