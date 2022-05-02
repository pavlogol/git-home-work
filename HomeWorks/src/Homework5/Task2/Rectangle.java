package Homework5.Task2;

public class Rectangle extends Round {
    private double h;
    private double w;

    public Rectangle(double height, double width) {
        this.h = height;
        this.w = width;
    }

    public double getSquare() {
        this.square = h * w;
        return this.square;
    }
}


