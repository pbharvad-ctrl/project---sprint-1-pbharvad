import java.util.ArrayList;
import java.util.List;

public class OrderManager implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String currentOrder;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(currentOrder);
        }
    }

    public void placeOrder(String order) {
        this.currentOrder = order;
        notifyObservers();
    }
}
