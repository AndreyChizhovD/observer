public class Journalist implements Observer {

    @Override
    public void update(Game game) {
        System.out.println("\nJournalists :\n" + game.getInfo());
    }
}
