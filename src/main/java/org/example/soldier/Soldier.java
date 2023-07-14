package org.example.soldier;

public class Soldier<damage> {

    public int getHealth() {
        return health;
    }

    public int health;

    public int getStrength() {
        return strength;
    }

    public int strength;




    
    




    public Soldier( int health, int strength){
        this.health = health;
        this.strength = strength;
    }

    public int attack (){

       return this.strength;
    }

    public void receiveDamage(int damage){


         this.health -= damage;

    }



    /*public void assertEquals(int health, 300){*/

}





