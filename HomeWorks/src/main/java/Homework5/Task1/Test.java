package Homework5.Task1;
//1.	Create a Java class that describes Vector. This class should have:
//        a.	Constructor with coordinates as arguments – x, y, z.
//        b.	Method that calculates the length of this 3d vector (formula).
//        c.	Method that calculates the dot product (scalar multiplication) – (x1*x2 + y1*y2 + z1*z2).
//        d.	Static method that creates an array (or a list) of random vectors.
//        e.	Some methods should be overloaded to use random vectors if they are called without arguments.


import static Homework5.Task1.Vector.*;

public class Test {
    public static void main(String[] args) {
//b
        Vector v1 = new Vector (1, 2, 3);
        System.out.println("length of this 3d vector: " + v1.lengthOfVector());
//c
        Vector v2 = new Vector (3, 2, 1);
        System.out.println("scalar multiplication: " + scalarMultiplication(v1,v2));
//d
        System.out.println("Random: " + random());
        System.out.println("RandomArray: " + randomArray());
//e
        Vector v3 = new Vector ();
        System.out.println("without arguments: " + v3.lengthOfVector());
        System.out.println("without arguments: " + scalarMultiplication(v1,v3));
    }
}

