public class Circle {
    public Point center;
    private double radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getSquare()
    {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter()
    {
        return 2 * this.radius * Math.PI;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }

    public int compare(Circle obj)
    {
        if (this.radius > obj.radius)
        {
            return 1;
        }
        else if (this.radius == obj.radius) {
            return 0;
        }
        else
        {
            return -1;
        }
    }
}
