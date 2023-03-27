import java.util.ArrayList;

public class ObserverController {

    private static ArrayList<Observer> observers = new ArrayList<>();

    public static void addObserver(Observer observer) {
        observers.add(observer);
    }

    public static void notifyObservers(Game game) {
        for (var observer : observers) {
            observer.update(game);
        }
    }
}
