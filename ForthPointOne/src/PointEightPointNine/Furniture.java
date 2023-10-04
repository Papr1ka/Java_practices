package PointEightPointNine;

public abstract class Furniture {
    private String color;
    private double cost;

    public Furniture(String color, double cost) {
        this.color = color;
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }

    abstract void build();
}
