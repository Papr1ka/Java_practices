import java.util.*;

public class Tester {
    Circle[] circleArray;
    int circleArrayLength;

    public Tester(int size) {
        this.circleArray = new Circle[size];
        this.circleArrayLength = size;
        Random rand = new Random();
        for (int i = 0; i < circleArrayLength; i++)
        {
            this.circleArray[i] = new Circle(new Point(rand.nextDouble(), rand.nextDouble()), rand.nextDouble());
        }
    }
    void test()
    {
        System.out.format("%-10s %-15s %10s\n", "-----", "Tester", "-----");

        for (int i = 0; i < circleArrayLength; i++)
        {
            System.out.println(circleArray[i]);
        }
        assert this.circleArrayLength == 2;
        assert this.circleArray[0].center.getX() == 0 && this.circleArray[0].center.getY() == 0;
        assert this.circleArray[1].center.getX() == 0 && this.circleArray[1].center.getY() == 0;

        System.out.format("New center: (%d, %d), New radius: %.1f%n", 3, 4, 5.4);
        circleArray[0].center.setX(3);
        circleArray[0].center.setY(4);
        circleArray[0].setRadius(5.4);
        System.out.format("Новый круг: %s", circleArray[0]);
        System.out.println("С кругом всё хорошо");

        System.out.format("%-10s %-15s %10s\n", "-----", "End Tester", "-----");
    }

    Comparator<Circle> comparator = Comparator.comparing(Circle::getRadius);
    public Circle getMin()
    {
        return Arrays.stream(this.circleArray)
                .min(Comparator.comparing(Circle::getRadius))
                .orElseThrow(NoSuchElementException::new);
    }

    public Circle getMax()
    {
        return Arrays.stream(this.circleArray)
                .max(Comparator.comparing(Circle::getRadius))
                .orElseThrow(NoSuchElementException::new);
    }

    public void sort()
    {
        Arrays.sort(this.circleArray);
    }

    @Override
    public String toString() {
        return "Tester{" +
                "circleArray=" + Arrays.toString(circleArray) +
                ", circleArrayLength=" + circleArrayLength +
                '}';
    }
}
