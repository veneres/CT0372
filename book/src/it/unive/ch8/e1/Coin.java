package it.unive.ch8.e1;

public class Coin {
    private double value;
    private String name;
    public Coin(double aValue, String aName){
        value = aValue;
        name = aName;
    }

    public double getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}
