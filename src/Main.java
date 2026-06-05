import payment.*;
import observer.*;
import factory.*;
import singleton.*;
import decorator.*;
import command.*;

public class Main {

    public static void main(String[] args) {

        // ==============================
        // Singleton Pattern
        // ==============================
        RestaurantSystem system = RestaurantSystem.getInstance();
        system.displayMessage();


        // ==============================
        // Strategy Pattern
        // ==============================
        System.out.println("\n--- Strategy Pattern: Payment Methods ---");

        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment());
        context.executePayment(25.99);

        context.setPaymentStrategy(new CashPayment());
        context.executePayment(15.50);

        context.setPaymentStrategy(new OnlinePayment());
        context.executePayment(40.00);


        // ==============================
        // Observer Pattern
        // ==============================
        System.out.println("\n--- Observer Pattern: Order Notifications ---");

        OrderManager manager = new OrderManager();

        KitchenStaff kitchen = new KitchenStaff();
        CustomerNotification customer = new CustomerNotification();

        manager.registerObserver(kitchen);
        manager.registerObserver(customer);

        manager.placeOrder("Burger with extra cheese");


        // ==============================
        // Factory Pattern
        // ==============================
        System.out.println("\n--- Factory Pattern: Food Creation ---");

        FoodItem burger = FoodFactory.createFood("burger");
        burger.prepare();

        FoodItem pizza = FoodFactory.createFood("pizza");
        pizza.prepare();


        // ==============================
        // Decorator Pattern
        // ==============================
        System.out.println("\n--- Decorator Pattern: Food Customization ---");

        Food customPizza = new BasicPizza();

        customPizza = new CheeseDecorator(customPizza);
        customPizza = new MushroomDecorator(customPizza);

        System.out.println("Food Item: " + customPizza.getDescription());
        System.out.println("Total Cost: $" + customPizza.getCost());


        // ==============================
        // Command Pattern
        // ==============================
        System.out.println("\n--- Command Pattern: Kitchen Operations ---");

        KitchenInvoker invoker = new KitchenInvoker();

        Command placeOrder = new PlaceOrderCommand();
        invoker.setCommand(placeOrder);
        invoker.executeCommand();

        Command cancelOrder = new CancelOrderCommand();
        invoker.setCommand(cancelOrder);
        invoker.executeCommand();
    }
}
