package Studio;

public class Tie extends Clothes implements MenClothing {
    public Tie(Sizes size, double cost, String color) {
        super(size, cost, color, ClothesTypes.TIE);
    }

    @Override
    public void dressMan() {

    }
}
