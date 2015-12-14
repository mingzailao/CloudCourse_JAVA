package MyGame;

/**
 * Created by apple on 15/12/14.
 */
public class Monster extends Creature {
    private String specialAbility;

    public Monster(String name, int health, int attach, int defend, String specialAbility) {
        super(name, health, attach, defend);
        this.specialAbility = specialAbility;
    }
}
