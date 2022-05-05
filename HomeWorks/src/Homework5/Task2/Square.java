package Homework5.Task2;

public class Square extends Rectangular {

    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double getSquare() {
        double square = a * a;
        return square;
    }
}

