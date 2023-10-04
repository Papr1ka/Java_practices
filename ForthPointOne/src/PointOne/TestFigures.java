package PointOne;

public class TestFigures {
    public void test()
    {
        Shape[] figures = new Shape[]{
                new Rectangle(new Point(0, 0), new Point(8, 4)),
                new Triangle(new Point(0, 0), new Point(4, 4), new Point(8, 0)),
                new Circle(new Point(0, 0), 10)
        };
        for (Shape figure: figures)
        {
            System.out.format("Фигура %15s, Площадь %10.2f, Периметр %10.2f%n",
                    figure.getType(), figure.getArea(), figure.getPerimeter());
        }

        Shape figure = null;
        try {
            figure = new Square(new Point(0, 0), new Point(10, 10));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.format("Фигура %15s, Площадь %10.2f, Периметр %10.2f%n",
                figure.getType(), figure.getArea(), figure.getPerimeter());
    }
}
