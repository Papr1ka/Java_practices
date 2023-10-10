package Second;

import First.Movable;
import First.MovablePoint;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void moveUp() {
        System.out.println("Rectangle: Move up");
        this.topLeft.moveUp();
        this.bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        System.out.println("Rectangle: Move down");
        this.topLeft.moveDown();
        this.bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        System.out.println("Rectangle: Move left");
        this.topLeft.moveLeft();
        this.bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        System.out.println("Rectangle: Move right");
        this.topLeft.moveRight();
        this.bottomRight.moveRight();
    }
}
