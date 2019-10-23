package it.unive.histogram;

import javax.swing.*;
import java.util.ArrayList;

public class HistogramViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 300);
        frame.setTitle("A simple histogram viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ArrayList<HistogramElement> list = new ArrayList<>();
        list.add(new HistogramElement("Intellij IDEA", 45));
        list.add(new HistogramElement("Eclipse IDE", 38));
        list.add(new HistogramElement("Apache NetBeans", 11));
        list.add(new HistogramElement("vi/vim/emacs", 3));
        list.add(new HistogramElement("Visual Studio Code", 1));
        list.add(new HistogramElement("Oracle JDeveloper", 1));
        HistogramComponent comp = new HistogramComponent(list);
        frame.add(comp);
        frame.setVisible(true);
    }
}
