package Homework5.Task2;

public class Oval extends Round {
    private double a;
    private double b;

    public Oval(double axisA, double axisB)
    {
        this.a=axisB;
        this.b=axisB;
    }
    public double getSquare()
    {
        this.square = a * b * PI;
        return this.square;
    }
}
