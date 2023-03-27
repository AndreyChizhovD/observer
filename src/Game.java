public class Game {

    private String name;
    private String achievements;
    private String info;
    private String requirements;

    public Game(String name, String achievements, String info, String requirements) {
        this.name = name;
        this.achievements = achievements;
        this.info = info;
        this.requirements = requirements;
    }

    public String getName() {
        System.out.println(name + " just came out!!!");
        return name;
    }

    public String getAchievements() {
        return achievements;
    }

    public String getInfo() {
        return info;
    }

    public String getRequirements() {
        return requirements;
    }
}
