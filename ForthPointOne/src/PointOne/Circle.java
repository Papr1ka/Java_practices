package PointOne;

public class Circle extends Shape implements Comparable<Circle> {
    public Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String getType() {
        return "Круг";
    }

    @Override
    public double getArea() {
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

    @Override
    public int compareTo(Circle o) {
        Double r = this.radius;
        return r.compareTo(o.getRadius());
    }
}
