package fr.univtln.master.lebret;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RedQueen on 14/12/2015.
 */
public class Disque extends Figure{
    private int x;
    private int y;
    private int rayon;
    private final String code;
    private int id = 0;
    private int nb;

    public Disque(int x, int y, int rayon) {
        this.x = x;
        this.y = y;
        this.rayon = rayon;
        this.code = "C"+id;
        this.id = nb;
        nb++;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getCode() {
        return code;
    }

    public List getCenter(){
        List center = new ArrayList();
        center.add(getX());
        center.add(getY());
        return center;
    }

    public double getArea(){
        return (3.14*rayon);
    }
}
