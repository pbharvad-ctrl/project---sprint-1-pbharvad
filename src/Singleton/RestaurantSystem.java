package singleton;

public class RestaurantSystem {

    private static RestaurantSystem instance;

    private RestaurantSystem() {
        System.out.println("Restaurant System Started.");
    }

    public static RestaurantSystem getInstance() {

        if(instance == null) {
            instance = new RestaurantSystem();
        }

        return instance;
    }

    public void displayMessage() {
        System.out.println("Restaurant Management System Running.");
    }
}
