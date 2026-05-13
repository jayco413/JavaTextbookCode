import java.util.ArrayList;
import java.util.List;

/**
 * The abstract class representing an adventurer.
 */
public abstract class AbstractAdventurer {
    public abstract String getName();
    public abstract String getAbility();
    public abstract int getLevel();

    public void defeatMonster() {
        System.out.printf("%s defeated a monster using %s with %d damage!",
            getName(), getAbility(), getLevel());
    }

    public String toString() {
        return getName();
    }

    public static void main(String[] args) {
        List<AbstractAdventurer> adventurers = new ArrayList<AbstractAdventurer>();
        adventurers.add(new Rogue());
        adventurers.add(new Wizard());
        adventurers.add(new Fighter());
        adventurers.add(new Barbarian());
        adventurers.add(new Knight());

        for (AbstractAdventurer adventurer : adventurers) {
            adventurer.defeatMonster();
        }
    }
}
