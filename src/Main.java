import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by drewmahrt on 4/27/16.
 */
public class Main {


    public static void main(String[] args) {
        //TODO: Create an array of Monsters, containing at least 2 different types (ie dragon and zombie)
        List<Monster> monsters = new ArrayList<>();
        monsters.add(new Dragon(50, 25, "Dragoon"));
        monsters.add(new Zombie(50, 8, "Dead Man Walkin'"));
        monsters.add(new Cthulhu(1000, 1000, "Cthulhu"));

        for (Monster monster : monsters) {
            System.out.println(monster.aboutMe());
        }


        //TODO: Loop through the array of Monsters, printing out something for each Monster

        Monster dragon = new Dragon(8, 9, "Dragoon");
        Monster zombie = new Zombie(10, 2, "Zombo");
        Monster cthulhu = new Cthulhu(1000, 1000, "Cthulhu");
        System.out.println();
        System.out.println();
        System.out.println(battle(cthulhu, dragon));
        System.out.println(retaliate(dragon, cthulhu));

    }

//I was just toying around with these methods, and I got too tired before I could figure out how to make them more general

    public static String battle(Monster aggressor, Monster victim) {

        return (aggressor.getName() + " attacks " + victim.getName() + "! It does " + aggressor.getDamage() + " damage! " +
                victim.getName() + "'s health is now " + (victim.getHealth() - aggressor.getDamage()) + ".");
    }

    public static String retaliate(Monster victim, Monster aggressor) {
        return (victim.getName() + " retaliates against " + aggressor.getName() + "! It does " + victim.getDamage() + " damage! " +
                aggressor.getName() + "'s health is now " + (aggressor.getHealth() - victim.getDamage()) + ".");
    }
}
