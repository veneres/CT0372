package it.unive.ch11.e15;

import java.awt.*;

public class LabeledPoint  extends Point {
    private String label;
    public LabeledPoint(int x, int y, String label){
        super(x,y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String toString(){
        return  String.format("it.unive.ch11.e15.LabeledPoint[x=%d,y=%d,label=\"%s\"]", x, y, label);
    }

    public static void main(String[] args) {
        LabeledPoint b = new LabeledPoint(10, 10, "A beautiful label");
        System.out.println(b);
    }
}
