package it.unive.rectangles;

public class RectanglesTest {
    public static void main(String[] args) {
        RectanglesManager  recMan = new RectanglesManager(10, 20, 10, 20, 10);
        RectanglesManager  recMan2 = new RectanglesManager(10, 20, 10, 20, 10);
        System.out.println(recMan.getMinRect());
        System.out.println(recMan2.getMinRect());
    }
}
