package Studio;

public abstract class Clothes {
    private final Sizes size;
    private final double cost;
    private final String color;
    private final ClothesTypes type;

    public Clothes(Sizes size, double cost, String color, ClothesTypes type) {
        this.size = size;
        this.cost = cost;
        this.color = color;
        this.type = type;
    }

    public Sizes getSize() {
        return size;
    }

    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "size=" + size +
                ", cost=" + cost +
                ", color='" + color + '\'' +
                ", type=" + type.getName() +
                '}';
    }
}
