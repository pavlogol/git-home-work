package Homework5.Task1;
//1.	Create a Java class that describes Vector. This class should have:
//        a.	Constructor with coordinates as arguments – x, y, z.
//        b.	Method that calculates the length of this 3d vector (formula).
//        c.	Method that calculates the dot product (scalar multiplication) – (x1*x2 + y1*y2 + z1*z2).
//        d.	Static method that creates an array (or a list) of random vectors.
//        e.	Some methods should be overloaded to use random vectors if they are called without arguments.


import java.util.Arrays;
import java.util.Random;

public class Vector {
    int x;
    int y;
    int z;

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Vector() {
        this.x = random();
        this.y = random();
        this.z = random();
    }

    public double lengthOfVector() {
        return Math.sqrt((x * x) + (y * y) + (z * z));
    }

    public static int scalarMultiplication(Vector v1, Vector v2) {
        return ((v1.x * v2.x) + (v1.y * v2.y) + (v1.z * v2.z));
    }

    public static int random() {
        Random random = new Random();
        return random.nextInt();
    }

    public static String randomArray() {
        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random();
        }
        return Arrays.toString(arr);
    }




}


