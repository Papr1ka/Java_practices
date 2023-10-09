package Forth;

public class MathFunc implements MathCalculable {

    @Override
    public double pow(double value, double degree) {
        return Math.pow(value, degree);
    }

    @Override
    public double absComplex(double x, double y) {
        return Math.hypot(x, y);
    }

    public double getCirclePerimeter(double radius)
    {
        return 2 * MathCalculable.PI * radius;
    }
}
