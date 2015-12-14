package fr.univtln.master.lebret;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by RedQueen on 14/12/2015.
 */
public class Test2 {

    public static JLabel diagList(Diagramme diag){
        Map<String, Figure> map = new HashMap<String, Figure>();
        map = diag.getCollect();
        String liste = "";
        Set<Map.Entry<String, Figure>> setmap = map.entrySet();
        for(Map.Entry<String, Figure> e : setmap){
            liste = liste+e.getKey()+"\n";
        }
        JLabel label = new JLabel(liste);
        return label;
    }

    public static void main(String[] args) {
        Map<String, Figure> map = new HashMap<String, Figure>();
        Disque d1 = new Disque(5,6,3);
        Rectangle r1 = new Rectangle(2,3,5,3);
        Carre s1 = new Carre(1,1,4);
        map.put(d1.getCode(), d1);
        map.put(r1.getCode(), r1);
        map.put(s1.getCode(), s1);

        Diagramme diag = new Diagramme(map);

        FigureView view = new FigureView(diagList(diag));
    }
}
