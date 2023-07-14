package org.example.war;

import org.example.vikins.Vikings;
import org.example.saxon.Saxon;

import java.util.ArrayList;
import java.util.List;

public class War {

    public List<Vikings> vikingArmy = new ArrayList<>();
    public List<Saxon> saxonArmy = new ArrayList<>();

    public List<Vikings> getVikingArmy() {

        return vikingArmy;
    }

    public List<Saxon> getSaxonArmy() {

        return saxonArmy;
    }

    public void addViking(Vikings viking) {
        vikingArmy.add(viking);

    }

    public void addSaxon(Saxon saxon) {
        saxonArmy.add(saxon);
    }

    public String vikingAttack() {
        int randomVikingIndex = (int) Math.floor(Math.random() * vikingArmy.size());
        int damage = vikingArmy.get(randomVikingIndex).attack();

        int randomSaxonIndex = (int) Math.floor(Math.random() * saxonArmy.size());
        saxonArmy.get(randomSaxonIndex).receiveDamage(damage);

        String msg = saxonArmy.get(randomSaxonIndex).getMsg();

        if (saxonArmy.get(randomSaxonIndex).getHealth() <= 0) {
            saxonArmy.remove(randomSaxonIndex);
        }
        return msg;
    }

    public String  saxonAttack(){
        int randomSaxonIndex = (int) Math.floor(Math.random() * saxonArmy.size());
        int damage = saxonArmy.get(randomSaxonIndex).attack();

        int randomVikingIndex = (int) Math.floor(Math.random() * vikingArmy.size());
        vikingArmy.get(randomVikingIndex).receiveDamage(damage);

        String msg = vikingArmy.get(randomVikingIndex).getMsg();

        if (vikingArmy.get(randomVikingIndex).getHealth() <= 0){
            vikingArmy.remove(randomVikingIndex);
        }
        return msg;
    }


}

