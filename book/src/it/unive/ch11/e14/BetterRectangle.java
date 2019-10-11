package it.unive.ch11.e14;

import java.awt.*;

public class BetterRectangle extends Rectangle {

    public BetterRectangle(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    public double getArea() {
        return super.getHeight() * super.getWidth();
    }

    public double getPerimeter() {
        return super.getHeight()*2 + super.getWidth()*2;
    }
    public static void main(String[] args) {
        BetterRectangle a = new BetterRectangle(10,20, 30, 40);
        System.out.println(a.getArea());
        System.out.println(a.getPerimeter());
    }
}
