package org.example.war;

import org.example.vikins.Vikings;


import java.util.ArrayList;
import java.util.List;

public class War {

    private List<Vikings> vikingArmy;
    private List<Object>  saxonArmy;

    public War() {
        vikingArmy = new ArrayList<>();
        saxonArmy = new ArrayList<>();
    }

    public List<Vikings> getVikingArmy() {

        return vikingArmy;
    }
    public List<Object> getSaxonArmy(){

        return saxonArmy;
    }

    public void addViking(Vikings viking ) {
        vikingArmy.add(viking);

    }
    public void addSaxon(Object saxon) {
        saxonArmy.add(saxon);
    }

    public void vikingAttack(){
         viking.strength = 300;
         saxon.health -= viking.strength;
         
    }


}

