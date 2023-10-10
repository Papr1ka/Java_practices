package First;

public class Run {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(1, 2, 3, 4, 5);
        Movable m = circle;
        System.out.println(circle);
        m.moveDown();
        m.moveLeft();
        System.out.println(circle);
        m.moveRight();
        m.moveUp();
        System.out.println(circle);

        MovablePoint point = new MovablePoint(1, 2, 3, 4);
        m = point;
        System.out.println(point);
        m.moveDown();
        m.moveLeft();
        System.out.println(point);
        m.moveRight();
        m.moveUp();
        System.out.println(point);
    }
}
