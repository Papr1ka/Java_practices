package PointEightPointNine;

public class Shelf extends Furniture {

    public Shelf(String color, double cost) {
        super(color, cost);
    }

    @Override
    void build() {
        System.out.println("Собрана с умеренной сложностью");
    }

    @Override
    public String toString() {
        return "Шкаф, Цвет " + this.getColor() + " Цена " + this.getCost();
    }
}
