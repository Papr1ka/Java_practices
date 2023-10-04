package PointEightPointNine;

public class Closet extends Furniture {

    public Closet(String color, double cost) {
        super(color, cost);
    }

    @Override
    void build() {
        System.out.println("Собран тяжело");
    }

    @Override
    public String toString() {
        return "Шкаф, Цвет " + this.getColor() + " Цена " + this.getCost();
    }
}
