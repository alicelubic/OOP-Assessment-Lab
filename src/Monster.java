/**
 * Created by drewmahrt on 4/27/16.
 */
public abstract class Monster {
    private int mHealth;
    private int mDamage;
    private String mName;

    public Monster(int health, int damage, String name){
        mHealth = health;
        mDamage = damage;
        mName = name;
    }

    public int getHealth(){
        return mHealth;
    }
   //might not need setters? can't hurt tho
    public void setHealth(int health){
        mHealth = health;
    }

    public int getDamage(){
        return mDamage;
    }
    public void setDamage(int damage){
        mDamage = damage;
    }

    public String getName(){ return mName;}

    //TODO: Give the Monster health and damage properties, and create a constructor
    //Health and damage should be private member variables, so remember to add the correct methods required to access private variables 

    public abstract String aboutMe();





}
