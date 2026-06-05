package decorator;

public class CheeseDecorator extends FoodDecorator {

    public CheeseDecorator(Food food) {
        super(food);
    }

    @Override
    public String getDescription() {
        return food.getDescription() + " + Cheese";
    }

    @Override
    public double getCost() {
        return food.getCost() + 2.0;
    }
}
