package factory;

public class FoodFactory {

    public static FoodItem createFood(String foodType) {

        if(foodType.equalsIgnoreCase("burger")) {
            return new Burger();
        }

        if(foodType.equalsIgnoreCase("pizza")) {
            return new Pizza();
        }

        return null;
    }
}
