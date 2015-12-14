package fr.univtln.master.lebret;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RedQueen on 14/12/2015.
 */
public class Carre extends Figure{
    private int x;
    private int y;
    private int longueur;

    private String code;
    private int id = 0;
    private int nb;

    public Carre(int x, int y, int longueur) {
        this.x = x;
        this.y = y;
        this.longueur = longueur;
        this.code = "S"+id;
        this.id = nb;
        nb++;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getLongueur() {
        return longueur;
    }

    public String getCode() {
        return code;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public List getCenter(){
        List center = new ArrayList();
        center.add(getLongueur()/2);
        center.add(getLongueur()/2);
        return center;
    }

    public double getArea(){
        return getLongueur()*getLongueur();
    }
}
