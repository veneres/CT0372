package it.unive.ch9.e15;

import java.awt.*;

public class LabeledPoint {
    private String label;
    private double x;
    private double y;

    public LabeledPoint(double x, double y, String label) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    public String getLabel() {
        return label;
    }


    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String toString() {
        return String.format("LabeledPoint[x=%d,y=%d,label=\"%s\"]", x, y, label);
    }

    public static void main(String[] args) {
        LabeledPoint b = new LabeledPoint(10, 10, "A beautiful label");
        System.out.println(b);
    }
}
