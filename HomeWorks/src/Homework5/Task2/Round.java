package Homework5.Task2;

public abstract class Round implements Shape {
    public static final double PI = 3.14159;
    protected static double r;

    @Override
    public double getSquare() {
        double square = PI * r * r;
        return square;
    }
}