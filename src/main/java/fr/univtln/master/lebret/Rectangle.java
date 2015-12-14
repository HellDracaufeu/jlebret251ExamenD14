package fr.univtln.master.lebret;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RedQueen on 14/12/2015.
 */
public class Rectangle extends Figure{

    private int x;
    private int y;
    private int longueur;
    private int largeur;

    private String code;
    private int id = 0;
    private int nb;

    public Rectangle(int x, int y, int longueur, int largeur) {
        this.x = x;
        this.y = y;
        this.longueur = longueur;
        this.largeur = largeur;
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

    public int getLargeur() {
        return largeur;
    }

    public String getCode() {
        return code;
    }

    public List getCenter(){
        List center = new ArrayList();
        center.add(getLongueur()/2);
        center.add(getLargeur()/2);
        return center;
    }

    public double getArea(){
        return getLargeur()*getLongueur();
    }
}
