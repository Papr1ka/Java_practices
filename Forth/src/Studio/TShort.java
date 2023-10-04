package Studio;

public class TShort extends Clothes implements MenClothing, WomanClothing {

    public TShort(Sizes size, double cost, String color) {
        super(size, cost, color, ClothesTypes.TSHORT);
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWomen() {

    }
}
