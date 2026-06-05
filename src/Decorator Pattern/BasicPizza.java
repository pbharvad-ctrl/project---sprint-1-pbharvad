package decorator;

public class BasicPizza implements Food {

    @Override
    public String getDescription() {
        return "Pizza";
    }

    @Override
    public double getCost() {
        return 10.0;
    }
}
