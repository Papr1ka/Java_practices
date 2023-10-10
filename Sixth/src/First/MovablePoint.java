package First;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        System.out.println("Point: Move up");
        this.y += ySpeed;
    }

    @Override
    public void moveDown() {
        System.out.println("Point: Move down");
        this.y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        System.out.println("Point: Move left");
        this.x -= xSpeed;
    }

    @Override
    public void moveRight() {
        System.out.println("Point: Move right");
        this.x += xSpeed;
    }

    @Override
    public String toString() {
        return "First.MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
