/**
 * Created by drewmahrt on 4/27/16.
 */

//TODO: Make Skeleton a subclass of monster, and implement the aboutMe method.
//Example output of the aboutMe method: "I am a Zombie with 4 health and do 10 damage!"

public class Zombie extends Monster{

    public Zombie(int health, int damage, String name){
        super(health, damage, name);
    }

    public String aboutMe(){
        return "I am " + getName() + " the Zombie. I have " + getHealth() + " health and do " + getDamage() + " damage!";
    }



}
