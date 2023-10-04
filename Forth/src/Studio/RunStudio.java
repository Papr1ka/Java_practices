package Studio;

public class RunStudio {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShort(Sizes.S, 100, "Red"),
                new Skirt(Sizes.M, 200, "Blue"),
                new Tie(Sizes.L, 70, "Black"),
                new Pants(Sizes.XXS, 50, "Yellow")
        };
        Atelier atelier = new Atelier();
        atelier.dressMan(clothes);
        atelier.dressWomen(clothes);
    }
}
