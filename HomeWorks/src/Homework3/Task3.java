package Homework3;

import java.util.Scanner;

//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. (Create a separate method for each operation)
//        Test Data:
//        Input first number: 125
//        Input second number: 24
//        Expected Output :
//        125 + 24 = 149
//        125 - 24 = 101
//        125 x 24 = 3000
//        125 / 24 = 5
//        125 mod 24 = 5

public class Task3 {
    public static void main(String[] args) {
        String s1 = getInput("Input first number: ");
        String s2 = getInput("Input second number: ");
        System.out.println(s1 + " + " + s2 + " = " + addValues(s1,s2));
        System.out.println(s1 + " - " + s2 + " = " + subtractValues(s1,s2));
        System.out.println(s1 + " x " + s2 + " = " + multiplyValues(s1,s2));
        System.out.println(s1 + " / " + s2 + " = " + divideValues(s1,s2));
        System.out.println(s1 + " mod " + s2 + " = " + mod(s1,s2));
    }

    private static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    private static int addValues(String s1, String s2) {
        int d1 = Integer.parseInt(s1);
        int d2 = Integer.parseInt(s2);
        return d1+d2;
    }

    private static int subtractValues(String s1, String s2) {
        int d1 = Integer.parseInt(s1);
        int d2 = Integer.parseInt(s2);
        return d1 - d2;
    }

    private static int multiplyValues(String s1, String s2) {
        int d1 = Integer.parseInt(s1);
        int d2 = Integer.parseInt(s2);
        return d1 * d2;
    }

    private static int divideValues(String s1, String s2) {
        int d1 = Integer.parseInt(s1);
        int d2 = Integer.parseInt(s2);
        return d1 / d2;
    }

    private static int mod(String s1, String s2) {
        int d1 = Integer.parseInt(s1);
        int d2 = Integer.parseInt(s2);
        return d1 % d2;
    }

}
