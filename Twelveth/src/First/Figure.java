package First;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public abstract class Figure extends Shape {
    private double figureWidth;
    private double figureHeight;

    public Figure(Color color, double pos1, double pos2, double width, double height) {
        super(color, pos1, pos2);
        this.figureWidth = width;
        this.figureHeight = height;
    }

    public double getFigureWidth() {
        return figureWidth;
    }

    public void setFigureWidth(double width) {
        this.figureWidth = width;
    }

    public double getFigureHeight() {
        return figureHeight;
    }

    public void setFigureHeight(double height) {
        this.figureHeight = height;
    }

    protected abstract void paintComponent(Graphics g);
}
