package Homework5.Task2;

public abstract class Rectangular implements Shape {
    protected static double x;
    protected static double y;

    @Override
    public double getSquare() {
        double square = x * y;
        return square;
    }
}