package it.unive.ch2.e20;

import javax.swing.*;
import java.awt.*;

public class NameComponent extends JComponent {
    private String name;
    private int padding;

    public NameComponent(String name, int padding) {
        this.name = name;
        this.padding = padding;
    }

    public NameComponent(String name) {
        this(name, 5);
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        // Compute the right font size
        Font actualFont = g2.getFont();
        int stringWidth = g2.getFontMetrics().stringWidth(this.name) + 2 * padding;
        double widthRatio = g2.getClipBounds().getWidth() / stringWidth;
        int newFontSize = (int) ((actualFont.getSize() * widthRatio));
        int fontSizeToUse = Math.max(newFontSize, actualFont.getSize());
        g2.setFont(new Font(g2.getFont().getName(), Font.PLAIN, fontSizeToUse));
        // Compute the right dimension for the rectangle
        int recWidth = g2.getFontMetrics().stringWidth(this.name) + 2 * padding;
        int recHeight = g2.getFontMetrics().getHeight() + 2 * padding;
        int recInitialX = (int) (g2.getClipBounds().getWidth() - recWidth) / 2;
        int recInitialY = (int) (g2.getClipBounds().getHeight() - recHeight) / 2;
        Rectangle rec = new Rectangle(recInitialX, recInitialY, recWidth, recHeight);
        // Draw rectangle
        g2.setColor(Color.BLUE);
        g2.draw(rec);
        // Draw string
        g2.setColor(Color.RED);
        int stringInitialY = g2.getFontMetrics().getAscent() + padding;
        int stringInitialX = (recWidth - g2.getFontMetrics().stringWidth(this.name)) / 2;
        g2.drawString(this.name, recInitialX + stringInitialX, recInitialY + stringInitialY);
    }
}
