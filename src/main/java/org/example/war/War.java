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
}
