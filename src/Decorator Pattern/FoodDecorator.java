package decorator;

public abstract class FoodDecorator implements Food {

    protected Food food;

    public FoodDecorator(Food food) {
        this.food = food;
    }
}
