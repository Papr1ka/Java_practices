package Studio;

public enum ClothesTypes {
    TSHORT("Шорты"),
    TIE("Галстук"),
    PANTS("Штаны"),
    SKIRT("Юбка");

    private final String name;

    ClothesTypes(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
