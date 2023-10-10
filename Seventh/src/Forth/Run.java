package Forth;

public class Run {
    public static void main(String[] args) {
        MathFunc func = new MathFunc();
        MathCalculable m = func;
        System.out.println("Circle perimeter with R=10: " + func.getCirclePerimeter(10));
        System.out.println("Complex ABS of 3+4i: " + m.absComplex(3, 4));
        System.out.println("2:31: " + m.pow(2, 31));
    }
}
