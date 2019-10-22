package it.unive.clock;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JComponent;

public class ClockComponent extends JComponent {

    private Line2D getHand(Point2D c, double r1, double r2, double value, double divs) {
        double aux = 2.0 * Math.PI * (value / divs) - 0.5 * Math.PI;
        double computedCos = Math.cos(aux);
        double computedSin = Math.sin(aux);
        double x1 = r1 * computedCos;
        double y1 = r1 * computedSin;
        double x2 = r2 * computedCos;
        double y2 = r2 * computedSin;
        return new Line2D.Double(new Point2D.Double(c.getX() + x1, c.getY() + y1),
                new Point2D.Double(c.getX() + x2, c.getY() + y2));
    }

    private Ellipse2D getQuadrant(Point2D c, double r) {
        return new Ellipse2D.Double(c.getX() - 0.95 * r, c.getY() - 0.95 * r, 0.95 * r * 2, 0.95 * r * 2);
    }

    @Override
    public void paintComponent(Graphics gr) {
        Graphics2D g = (Graphics2D) gr;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        Calendar date = new GregorianCalendar();

        Point2D c = new Point2D.Double(getWidth() / 2, getHeight() / 2);
        double r = Math.min(c.getX(), c.getY());

        g.setColor(Color.white);
        g.fill(getQuadrant(c, r));
        g.setStroke(new BasicStroke(4.0f));
        g.setColor(Color.black);
        g.draw(getQuadrant(c, r));

        g.setStroke(new BasicStroke(4.0f));
        for (int tick = 0; tick < 60; tick += 5)
            g.draw(getHand(c, 0.80 * r, 0.90 * r, tick, 60));
        g.setStroke(new BasicStroke(2.0f));
        for (int tick = 0; tick < 60; tick += 1)
            g.draw(getHand(c, 0.86 * r, 0.90 * r, tick, 60));

        g.setStroke(new BasicStroke(4.0f));
        g.setColor(Color.blue);
        g.draw(getHand(c, 0, 0.7 * r, date.get(Calendar.MINUTE), 60));

        g.setStroke(new BasicStroke(2.0f));
        g.setColor(Color.red);
        g.draw(getHand(c, 0, 0.9 * r, date.get(Calendar.SECOND), 60));

        g.setStroke(new BasicStroke(10.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_MITER));
        g.setColor(Color.black);
        g.draw(getHand(c, 0, 0.5 * r, date.get(Calendar.HOUR), 12));
    }

}

