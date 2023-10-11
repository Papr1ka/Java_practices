package First;

import javax.swing.*;
import java.awt.*;

abstract public class Shape extends JComponent {
    private Color color;
    private double pos1;
    private double pos2;

    public Shape(Color color, double pos1, double pos2) {
        this.color = color;
        this.pos1 = pos1;
        this.pos2 = pos2;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getPos1() {
        return pos1;
    }

    public void setPos1(double pos1) {
        this.pos1 = pos1;
    }

    public double getPos2() {
        return pos2;
    }

    public void setPos2(double pos2) {
        this.pos2 = pos2;
    }
}
