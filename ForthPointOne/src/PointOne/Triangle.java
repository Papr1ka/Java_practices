package PointOne;

public class Triangle extends Shape {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point first, Point second, Point third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public Point getFirst() {
        return first;
    }

    public void setFirst(Point first) {
        this.first = first;
    }

    public Point getSecond() {
        return second;
    }

    public void setSecond(Point second) {
        this.second = second;
    }

    public Point getThird() {
        return third;
    }

    public void setThird(Point third) {
        this.third = third;
    }

    @Override
    public String getType() {
        return "Треугольник";
    }

    @Override
    double getArea() {
        double a = this.first.getDistance(this.second);
        double b = this.second.getDistance(this.third);
        double c = this.third.getDistance(this.first);
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    double getPerimeter() {
        double a = this.first.getDistance(this.second);
        double b = this.second.getDistance(this.third);
        double c = this.third.getDistance(this.first);
        return a + b + c;
    }
}
