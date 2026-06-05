package factory;

public class BurgerCreator extends FoodCreator {

    @Override
    public FoodItem createFood() {
        return new Burger();
    }
}
