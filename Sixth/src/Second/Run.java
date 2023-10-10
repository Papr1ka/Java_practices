package Second;

import First.Movable;
import First.MovableCircle;
import First.MovablePoint;

public class Run {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(1, 1, 2, 2, 5, 10);
        Movable m = rectangle;
        System.out.println(rectangle);
        m.moveDown();
        m.moveLeft();
        System.out.println(rectangle);
        m.moveRight();
        m.moveUp();
        System.out.println(rectangle);
    }
}
