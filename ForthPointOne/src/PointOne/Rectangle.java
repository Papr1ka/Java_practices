package PointOne;

public class Rectangle extends Shape {
    private Point first;
    private Point second;

    public Rectangle(Point first, Point second) {
        this.first = first;
        this.second = second;
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

    @Override
    public String getType() {
        return "Прямоугольник";
    }

    @Override
    double getArea() {
        return Math.abs(this.first.getX() - this.second.getX()) * Math.abs(this.first.getY() - this.second.getY());
    }

    @Override
    double getPerimeter() {
        return Math.abs(this.first.getX() - this.second.getX()) * 2 + Math.abs(this.first.getY() - this.second.getY()) * 2;
    }
}
