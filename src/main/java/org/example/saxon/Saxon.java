package org.example.saxon;

import org.example.soldier.Soldier;

public class Saxon extends Soldier {
    public String msg;

    public Saxon(int health, int strength) {
        super(health, strength);

    }

    @Override
    public int attack() {
        return super.attack();
    }

    public void receiveDamage(int damage) {

        this.health -= damage;
            if (health > 0) {
            this.msg = "A Saxon has received " + damage + " points of damage";
            }else { this.msg = "A Saxon has died in combat";
        }
    }

    public String getMsg() {
        return  this.msg;
    }
}