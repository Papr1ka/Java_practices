package Studio;

public class Skirt extends Clothes implements WomanClothing {

    public Skirt(Sizes size, double cost, String color) {
        super(size, cost, color, ClothesTypes.SKIRT);
    }

    @Override
    public void dressWomen() {

    }
}
