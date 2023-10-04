package PointEightPointNine;

public class FurnitureShop {
    public void test()
    {
        Furniture[] furnitures = new Furniture[]{new Shelf("Red", 100), new Closet("Blue", 200)};
        for (Furniture f : furnitures)
        {
            System.out.println("Заказали сборку мебели - " + f);
            f.build();
        }
    }
}
