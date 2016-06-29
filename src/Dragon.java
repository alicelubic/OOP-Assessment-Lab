/**
 * Created by drewmahrt on 4/27/16.
 */

//TODO: Make Dragon a subclass of Monster, implement the aboutMe method.
//Example output for aboutMe: "I am a Dragon with 3 health and do 8 damage!"

public class Dragon extends Monster{
    Dragon dragon;

    public Dragon(int health, int damage){
        super(health, damage);


    }
    public String aboutMe(){
        return "I am a Dragon with 10 health and do 10 damage!";
    }


}
