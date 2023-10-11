package First;

import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Circle extends Figure {
    public Circle(Color color, double pos1, double pos2, double width, double height) {
        super(color, pos1, pos2, width, height);
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        g2.setStroke(new BasicStroke(5));
        Ellipse2D elipse = new Ellipse2D.Double(this.getPos1(), this.getPos2(), this.getFigureWidth(), this.getFigureHeight());
        g2.setPaint(this.getColor());
        g2.draw(elipse);
    }
}
