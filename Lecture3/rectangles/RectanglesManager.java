import java.awt.*;
import java.util.Arrays;
import java.util.Random;

/**
 * A more OOP approach to rectangles problem
 */
@SuppressWarnings("Duplicates")
public class RectanglesManager {
    private int minSz = 1;
    private int mazSz = 10;
    private int minCoord = -5;
    private int maxCoord = 5;
    private int nRect = 2;
    private Rectangle[] rects;

    public RectanglesManager(int minSz, int maxSz, int minCoord, int maxCoord, int nRect) {
        this.minSz = minSz;
        this.mazSz = maxSz;
        this.minCoord = minCoord;
        this.maxCoord = maxCoord;
        this.nRect = nRect;
        this.rects = new Rectangle[nRect];
        Random generator = new Random();
        for (int i = 0; i < rects.length; i++) {
            int width = generator.nextInt(maxSz - minSz) + minSz;
            int height = generator.nextInt(maxSz - minSz) + minSz;
            int x = generator.nextInt(maxCoord - minCoord) + minCoord;
            int y = generator.nextInt(maxCoord - minCoord) + minCoord;
            rects[i] = new Rectangle(x, y, width, height);
            System.out.println("Generated: " + rects[i] + "area = " + rects[i].getWidth() * rects[i].getHeight());
        }
        Arrays.sort(rects, (x, y) -> {
            double x_area = x.getWidth() * x.getHeight();
            double y_area = y.getWidth() * y.getHeight();
            if (x_area > y_area) return 1;
            else if (x_area < y_area) return -1;
            return 0;
        });
    }

    public Rectangle[] getRects() {
        return rects;
    }
    public Rectangle getMinRect(){
        Rectangle bb = new Rectangle(rects[0]);
        for (Rectangle r : rects)
            bb = r.union(bb);
        return bb;
    }


    public int getMinSz() {
        return minSz;
    }

    public int getMazSz() {
        return mazSz;
    }

    public int getMinCoord() {
        return minCoord;
    }

    public int getMaxCoord() {
        return maxCoord;
    }

    public int getnRect() {
        return nRect;
    }
}
