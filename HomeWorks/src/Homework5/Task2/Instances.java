package Homework5.Task2;

public class Instances {
    public static void main(String[] args) {
        Shape circle = new Circle (5.0);
        Shape oval = new Oval(3.0, 5.0);
        Shape square = new Square(5);
        Shape rectangle = new Rectangle (5.0, 4.0);

        System.out.println("Parameters this circle: Square = " + circle.getSquare());
        System.out.println("Parameters this oval: Square = " + oval.getSquare());
        System.out.println("Parameters this square: Square = " + square.getSquare());
        System.out.println("Parameters this rectangle: Square = " + rectangle.getSquare());
    }
}
