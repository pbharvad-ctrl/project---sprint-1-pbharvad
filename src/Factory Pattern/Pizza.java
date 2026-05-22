package factory;

public class Pizza implements FoodItem {

    @Override
    public void prepare() {
        System.out.println("Pizza is being prepared.");
    }
}
