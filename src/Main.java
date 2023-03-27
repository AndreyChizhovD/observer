public class Main {

    public static void main(String[] args) {
        ObserverController.addObserver(new Gamer());
        ObserverController.addObserver(new Journalist());
        ObserverController.addObserver(new Developer());

        ObserverController.notifyObservers(Games.GAME1);
        ObserverController.notifyObservers(Games.GAME2);
        ObserverController.notifyObservers(Games.GAME3);
    }
}