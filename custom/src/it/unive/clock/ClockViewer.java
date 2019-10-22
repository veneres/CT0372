package it.unive.clock;

import javax.swing.*;

public class ClockViewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 300);
        frame.setTitle("A clock viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ClockComponent comp = new ClockComponent();
        frame.add(comp);
        frame.setVisible(true);
        Timer timer = new Timer(500, actionEvent -> {
            frame.revalidate();
            frame.repaint();
        });
        timer.start();
    }
}
