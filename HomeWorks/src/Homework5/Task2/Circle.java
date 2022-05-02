package Homework5.Task2;

public class Circle extends Round {
    private double r;

    public Circle(double radius) {
        this.r = radius;
    }

    public double getSquare() {
        this.square = PI * r * r;
        return this.square;
    }
}
