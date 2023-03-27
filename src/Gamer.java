public class Gamer implements Observer {

    @Override
    public void update(Game game) {
        System.out.println(
            "\nGamers :\n" + game.getName() + " game has achievements : " + game.getAchievements());
    }
}
