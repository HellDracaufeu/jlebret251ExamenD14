package fr.univtln.master.lebret;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RedQueen on 14/12/2015.
 */
public class Polyedre extends Figure{
    private int[] sommets;

    private String code;
    private int id = 0;
    private int nb;

    public Polyedre(int[] sommets) {
        this.sommets = sommets;
        this.code = "S"+id;
        this.id = nb;
        nb++;
    }

    public List getCenter(){
        return null;
    }

    public double getArea(){
        return 0;
    }

}
