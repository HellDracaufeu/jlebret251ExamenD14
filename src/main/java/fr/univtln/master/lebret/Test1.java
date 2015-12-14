package fr.univtln.master.lebret;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by RedQueen on 14/12/2015.
 */
public class Test1 {


    public static void main(String[] args) {

        List<Figure> figures = new ArrayList<Figure>();
        Disque d1 = new Disque(5,6,3);
        Rectangle r1 = new Rectangle(2,3,5,3);
        Carre s1 = new Carre(1,1,4);

        figures.add(d1);
        figures.add(r1);
        figures.add(s1);
        double totArea = 0;
        Iterator<Figure> iterator = figures.iterator();
        while(iterator.hasNext()){
            totArea = totArea + iterator.next().getArea();
        }

        System.out.println("L'aire totale est "+totArea);
    }
}
