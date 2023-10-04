package PointOne;

public class Square extends Rectangle {

    public Square(Point first, Point second) throws Exception {
        super(first, second);
        if (Math.abs(first.getX() - second.getX()) - Math.abs(first.getY() - second.getY()) > 0.0000001)
        {
            throw new Exception("Не квадрат");
        }
    }

    @Override
    public String getType() {
        return "Квадрат";
    }
}
