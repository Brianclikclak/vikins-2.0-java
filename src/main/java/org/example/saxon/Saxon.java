package org.example.saxon;

import org.example.soldier.Soldier;

public class Saxon extends Soldier {
    public String msg;

    public Saxon(int health, int strength) {
        super(health, strength);

    }

    @Override
    public int attack()
    {
        return super.attack();
    }

    public void receiveDamage(int damage) {
        super.receiveDamage(damage);
       /* this.health -= damage;*/
            if (this.health > 0) {
            this.setMsg("A Saxon has received " + damage + " points of damage");
            }else { this.setMsg("A Saxon has died in act of combat");
        }
    }

    public String getMsg() {
        return  this.msg;
    }


        public void setMsg(String msg){
        this.msg = msg;
}


    public void setHealth(int health) {
        this.health = health;
    }
}