import java.awt.*;

public class Figure extends Shape {
    private double width;
    private double height;

    public Figure(Color color, double pos1, double pos2, double width, double height) {
        super(color, pos1, pos2);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
