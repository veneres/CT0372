package it.unive.custom.rectangles;

import java.awt.Rectangle;
import java.util.Arrays;
import java.util.Random;


public class Rectangles {

    private static final int MIN_SZ = 1;
    private static final int MAX_SZ = 10;
    private static final int MIN_COORD = -5;
    private static final int MAX_COORD = 5;
    private static final int N_RECT = 2;

    public static void main(String[] args){

        Random generator = new Random();
        // it.unive.custom.it.unive.rectangles.Rectangles generation
        Rectangle[] rect = new Rectangle[N_RECT];
        for (int i = 0; i < rect.length; i++) {
            int width = generator.nextInt(MAX_SZ - MIN_SZ) + MIN_SZ;
            int height = generator.nextInt(MAX_SZ - MIN_SZ) + MIN_SZ;
            int x = generator.nextInt(MAX_COORD - MIN_COORD) + MIN_COORD;
            int y = generator.nextInt(MAX_COORD - MIN_COORD) + MIN_COORD;
            rect[i] = new Rectangle(x, y, width, height);
            System.out.println("Generated: " + rect[i] + "area = " + rect[i].getWidth() * rect[i].getHeight());
        }

        /* sort in place by area with bubblesort
        for (int i = 0; i < rect.length; i++)
            for (int j = 0; j < rect.length - 1; j++) {
                double area1 = rect[j].getWidth() * rect[j].getHeight();
                double area2 = rect[j + 1].getWidth() * rect[j + 1].getHeight();
                if (area1 > area2) {
                    Rectangle tmp = rect[j];
                    rect[j] = rect[j + 1];
                    rect[j + 1] = tmp;
                }
            }

         */

        // Sort in place by area with lambda exp
        Arrays.sort(rect, (x, y) -> {
            double x_area = x.getWidth() * x.getHeight();
            double y_area = y.getWidth() * y.getHeight();
            if (x_area > y_area) return 1;
            else if (x_area < y_area) return -1;
            return 0;
        });


        // Print sorted array
        for (Rectangle r : rect)
            System.out.println("Area = " + r.getWidth() * r.getHeight());

        // Bounding box with union method
        Rectangle bb = new Rectangle(rect[0]);
        for (Rectangle r : rect)
            bb = r.union(bb);

        System.out.println("Bounding box = " + bb);

        // Bounding box with max/min coordinates
        int min_x = rect[0].x;
        int max_x = rect[0].x + rect[0].width;
        int min_y = rect[0].y;
        int max_y = rect[0].y + rect[0].height;

        for (Rectangle r : rect) {
            if (r.x < min_x) min_x = r.x;
            if (r.y < min_y) min_y = r.y;
            if (r.x + r.width > max_x) max_x = r.x + r.width;
            if (r.y + r.height > max_y) max_y = r.y + r.height;
        }

        Rectangle bb2 = new Rectangle(min_x, min_y, max_x - min_x, max_y - min_y);
        System.out.println("Bounding box2 = " + bb2);
    }

}
