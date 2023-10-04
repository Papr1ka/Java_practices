package Studio;

public class Pants extends Clothes implements MenClothing, WomanClothing {
    public Pants(Sizes size, double cost, String color) {
        super(size, cost, color, ClothesTypes.PANTS);
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWomen() {

    }
}
