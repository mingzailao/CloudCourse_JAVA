package MyGame;

/**
 * Created by apple on 15/12/14.
 */
public class Creature {
    private String name;
    private int health;
    private int attach;
    private int defend;

    public String getName() {
        return name;
    }

    public Creature(String name, int health, int attach, int defend) {
        this.name = name;
        this.health = health;
        this.attach = attach;
        this.defend = defend;
    }

    public void setParameters() {

    }

    @Override
    public String toString() {
        return "Creature{" +
                "defend=" + defend +
                ", name='" + name + '\'' +
                ", health=" + health +
                ", attach=" + attach +
                '}';
    }
}
