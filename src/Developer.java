public class Developer implements Observer {

    @Override
    public void update(Game game) {
        System.out.println(
            "\nDevelopers :\ngame " + game.getName() + " has following minimal requirements : "
                + game.getRequirements() + "\n\n");
    }
}
