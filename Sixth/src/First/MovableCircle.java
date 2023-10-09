package First;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "First.MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    @Override
    public void moveUp() {
        System.out.println("Circle: Move up");
        this.center.moveUp();
    }

    @Override
    public void moveDown() {
        System.out.println("Circle: Move down");
        this.center.moveDown();
    }

    @Override
    public void moveLeft() {
        System.out.println("Circle: Move left");
        this.center.moveLeft();
    }

    @Override
    public void moveRight() {
        System.out.println("Circle: Move right");
        this.center.moveRight();
    }
}
