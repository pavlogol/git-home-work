package Homework5.Task2;

public class Square extends Round {
    private double a;

    public Square(double side) {
        this.a = side;
    }

    public double getSquare() {
        this.square = a * a;
        return this.square;
    }
}

