package command;

public class CancelOrderCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Order cancelled.");
    }
}
