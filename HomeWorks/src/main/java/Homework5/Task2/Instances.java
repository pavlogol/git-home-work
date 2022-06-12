package Homework5.Task2;

public class Instances {
    public static void main(String[] args) {
        Shape circle = new Circle (5.0);
        Shape oval = new Oval(3.0, 5.0);
        Shape square = new Square(12);
        Shape rectangle = new Rectangle(4, 5);

        System.out.println("Circle: square = " + circle.getSquare());
        System.out.println("Oval: square = " + oval.getSquare());
        System.out.println("Square: square = " + square.getSquare());
        System.out.println("Rectangle: square = " + rectangle.getSquare());
        System.out.printf("%.5f", 3.14159265358979323846);
    }
}
