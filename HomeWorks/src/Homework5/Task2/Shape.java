package Homework5.Task2;
//2.	You need to implement at least four basic shapes and calculate squares for each shape:
//        a.	In a separate package create an interface Shape, which should be implemented by two abstract classes – Round and Rectangular.
//        b.	Abstract classes should implement the method from the interface – getSquare().
//        c.	Each abstract class should have two child classes - Circle, Oval, Square, Rectangle.
//        d.	Override getSquare() method for some classes if needed.
//        e.	Create class instances and calculate their squares.
//

public interface Shape
{
    public double getSquare();
}