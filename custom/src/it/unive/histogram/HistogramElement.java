package it.unive.histogram;

import java.awt.*;
import java.util.Random;

public class HistogramElement {
    private String label;
    private int value;
    private Color color;
    private static Random rndGen = new Random();

    public HistogramElement(String label, int value, Color color) {
        this.label = label;
        this.value = value;
        this.color = color;
    }

    public HistogramElement(String label, int value){
        this(label, value, getRandomColor());
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static Random getRndGen() {
        return rndGen;
    }

    public static void setRndGen(Random rndGen) {
        HistogramElement.rndGen = rndGen;
    }

    private static Color getRandomColor(){
        float r = rndGen.nextFloat();
        float g = rndGen.nextFloat();
        float b = rndGen.nextFloat();
        return new Color(r,g,b);
    }
}
