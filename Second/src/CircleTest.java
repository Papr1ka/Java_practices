public class CircleTest {
    public static void main(String[] args) {
        System.out.format("%-10s %-15s %10s\n", "-----", "CircleTest", "-----");

        Circle c1 = new Circle(new Point(0, 0), 3);
        Circle c2 = new Circle(new Point(1, 1), 4);
        Circle c3 = new Circle(new Point(2, 2), 3);
        assert ((c1.getPerimeter() - 18.84) < 0.1);
        assert ((c2.getPerimeter() - 25.12) < 0.1);
        assert ((c1.getSquare() - 28.26) < 0.1);
        assert ((c2.getSquare() - 50.24) < 0.1);
        assert (c1.compare(c3) == 0);
        assert (c1.compare(c2) == -1);
        assert (c2.compare(c1) == 1);
        System.out.println("Все тесты пройдены");
        System.out.format("Круг %s, площадь %f, периметр %f%n", c1, c1.getSquare(), c1.getPerimeter());

        System.out.format("%-10s %-15s %10s\n", "-----", "End CircleTest", "-----");
    }
}
