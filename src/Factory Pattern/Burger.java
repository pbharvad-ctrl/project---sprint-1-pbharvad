package factory;

public class Burger implements FoodItem {

    @Override
    public void prepare() {
        System.out.println("Burger is being prepared.");
    }
}
