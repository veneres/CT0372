package it.unive.ch2.e20;

import javax.swing.*;

public class NameViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 300);
        frame.setTitle("A name viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // see https://en.wikipedia.org/wiki/Hubert_Blaine_Wolfeschlegelsteinhausenbergerdorff_Sr.
        NameComponent comp = new NameComponent("Wolfeschlegelsteinhausenbergerdorff");
        frame.add(comp);
        frame.setVisible(true);
    }
}
