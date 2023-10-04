package PointEight;

public class Tester {
    public void test()
    {
        Shape[] figures = new Shape[]{
                new Rectangle(100, 200, "Red", true),
                new Circle(15, "Yellow", true),
                new Square(10)
        };
        for (Shape figure: figures)
        {
            System.out.format("%-100s, Area=%10.2f, Perimetr=%10.2f%n", figure, figure.getArea(), figure.getPerimeter());
        }
    }
}
