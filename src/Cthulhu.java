/**
 * Created by owlslubic on 6/29/16.
 */
public class Cthulhu extends Monster{


    public Cthulhu(int health, int damage, String name){

        super(health, damage, name);
    }

    @Override
    public String aboutMe() {
        return ("I am Cthulhu. I have returned! My health is " + getHealth() + " and I do " + getDamage() + " damage." +
        "\n \nPh'nglui mglw'nafh Cthulhu R'lyeh wgah'nagl fhtagn!\n" +
                "Ph'nglui mglw'nafh Cthulhu R'lyeh wgah'nagl fhtagn!\n" +
                "Ph'nglui mglw'nafh Cthulhu R'lyeh wgah'nagl fhtagn!\n" +
                "Ph'nglui mglw'nafh Cthulhu R'lyeh wgah'nagl fhtagn!");

    }


}
