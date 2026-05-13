import java.util.Set;
import java.util.TreeSet;

/**
 * Test program for comparable adventurers.
 */
public class ComparableAdventurersTest {
    public static void main(String[] args) {
        Set<AbstractAdventurer> adventurers = new TreeSet<AbstractAdventurer>();
        adventurers.add(new Rogue());
        adventurers.add(new Wizard());
        adventurers.add(new Fighter());
        adventurers.add(new Barbarian());
        adventurers.add(new Knight());
        adventurers.add(new Elf());

        for (AbstractAdventurer adventurer : adventurers) {
            System.out.println(adventurer.getName() + " - Level: " + adventurer.getLevel());
        }
    }
}
