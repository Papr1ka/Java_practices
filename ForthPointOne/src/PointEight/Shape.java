package PointEight;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    abstract double getArea();
    abstract double getPerimeter();

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape() {
        this.color = "";
        this.filled = false;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return String.format("Shape: filled=%s, color=%s, perimeter=%f, area=%f",
                this.isFilled(), this.getColor(), this.getPerimeter(), this.getArea());
    }
}
