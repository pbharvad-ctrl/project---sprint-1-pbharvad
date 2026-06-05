package factory;

public class PizzaCreator extends FoodCreator {

    @Override
    public FoodItem createFood() {
        return new Pizza();
    }
}
