package it.unive.histogram;

import javax.swing.*;
import java.awt.*;
import java.time.temporal.ValueRange;
import java.util.ArrayList;

public class HistogramComponent extends JComponent {
    private ArrayList<HistogramElement> valueList;
    private static final int PADDING = 20;
    private static final int LABEL_HEIGHT = 20;
    private static final int VALUE_HEIGHT = 20;

    public HistogramComponent(ArrayList<HistogramElement> valueList) {
        if (valueList.size() == 0) {
            throw new IllegalArgumentException("Array size must be greater than 0");
        }
        this.valueList = valueList;
    }

    private int getMax() {
        int max = valueList.get(0).getValue();
        for (HistogramElement histogramElement : valueList) {
            if (histogramElement.getValue() > max) {
                max = histogramElement.getValue();
            }
        }
        return max;
    }


    private void drawBars(Graphics2D g2, Rectangle clipBounds, double unit, double barWidth, int i) {
        HistogramElement histogramElement = this.valueList.get(i);
        double barHeight = histogramElement.getValue() * unit;
        double barX = i * barWidth + PADDING;
        double barY = clipBounds.getHeight() - (barHeight + PADDING + LABEL_HEIGHT);
        g2.setColor(histogramElement.getColor());
        g2.fill(new Rectangle.Double(barX, barY, barWidth, barHeight));
    }

    private void drawLabels(Graphics2D g2, Rectangle clipBounds, double barWidth, int i) {
        double stringX = i * barWidth + PADDING;
        double stringY = clipBounds.getHeight() - PADDING;
        g2.drawString(this.valueList.get(i).getLabel(), (float) stringX, (float) stringY);
    }

    private void drawValues(Graphics2D g2, Rectangle clipBounds, double unit, double barWidth, int i) {
        double valueX = i * barWidth + PADDING + barWidth/3;
        double value = valueList.get(i).getValue();
        double valueY = clipBounds.getHeight() - (value * unit + PADDING + VALUE_HEIGHT);
        String stringValue = String.valueOf(value);
        g2.drawString(stringValue, (float) valueX, (float) valueY);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        Rectangle clipBounds = g.getClipBounds();
        int total_padding = 2 * PADDING + LABEL_HEIGHT + VALUE_HEIGHT;
        double unit = (clipBounds.getHeight() - (total_padding)) / getMax();
        double barWidth = (clipBounds.getWidth() - (total_padding)) / this.valueList.size();
        // draw the histogram
        for (int i = 0; i < this.valueList.size(); i++) {
            drawBars(g2, clipBounds, unit, barWidth, i);
            // let's use a more sober color to print the labels and values
            g2.setColor(Color.BLACK);
            drawLabels(g2, clipBounds, barWidth, i);
            drawValues(g2, clipBounds, unit, barWidth, i);
        }
    }


}
