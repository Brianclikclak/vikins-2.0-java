package org.example.vikins;

import org.example.soldier.Soldier;

public class Vikings extends Soldier{
    public String name = "Ragnar Loothbruk";
    public String msg;
    public Vikings(String name ,int health, int strength) {
        super(health, strength);
    }

    public int attack (){
        return this.strength;
    }

    public void receiveDamage(int damage) {
        this.health -= damage;
        if (this.health > 0){
            this.msg = this.name + "has received " + damage + " points of damage";
        } else {
             this.msg = this.name + "has died in act of combat";
        }
    }
    public String getMsg(){
        return this.msg;
    }

    public String battleCry(){
        return  "Odin Owns You All!";

    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }
}








