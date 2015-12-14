package fr.univtln.master.lebret;

import java.util.Map;

/**
 * Created by RedQueen on 14/12/2015.
 */
public class Diagramme {

    private Map<String, Figure> collect;
    private int id;

    public Diagramme(Map<String, Figure> collect) {
        this.collect = collect;
        id++;
    }

    public Map<String, Figure> getCollect() {
        return collect;
    }

    public double getCenter(){
        return 0;
    }

    public static Rectangle getBoundingBox(){
        return null;
    }
}
