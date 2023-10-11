package First;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Rectangle extends Figure {

    public Rectangle(Color color, double pos1, double pos2, double width, double height) {
        super(color, pos1, pos2, width, height);
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D)g;
        g2.setStroke(new BasicStroke(5));
        Rectangle2D rectangle = new Rectangle2D.Double(this.getPos1(), this.getPos2(), this.getFigureWidth(), this.getFigureHeight());
        g2.setPaint(this.getColor());
        g2.draw(rectangle);
    }
}
