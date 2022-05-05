package Homework5.Task2;

public class Oval extends Round {
    private double a;
    private double b;

    public Oval(double axisA, double axisB) {
        this.a = axisA;
        this.b = axisB;
    }

    @Override
    public double getSquare() {
        double square = a * b * PI;
        return square;
    }
}


