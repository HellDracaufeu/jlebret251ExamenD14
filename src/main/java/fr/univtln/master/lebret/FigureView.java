package fr.univtln.master.lebret;

import javax.swing.*;
import javax.swing.text.StringContent;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by RedQueen on 14/12/2015.
 */
public class FigureView {

    private JFrame frame;
    private JPanel panel;
    private JLabel label;

    public FigureView(JLabel lab){
        frame = new JFrame("IHM simple");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(250, 180));
        panel = new JPanel(new FlowLayout());
        //label = new JLabel("Liste de figures");
        panel.add(lab);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);

    }



    public static void main(String[] args) {
        //FigureView view = new FigureView();
    }
}
