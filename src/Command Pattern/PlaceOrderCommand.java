package command;

public class PlaceOrderCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Order placed successfully.");
    }
}
