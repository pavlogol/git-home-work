package Homework3;

import java.util.LinkedHashSet;

//Write a Java program to find the duplicate values of an array of integer values.
//        Test Data:
//        [5,6,7,12,-5,32,43,6,12]
//        Expected Output : 6,12

public class Task5 {
    public static void main(String[] args) {
        int myArray[] = {5, 6, 7, 12, -5, 32, 43, 6, 12};
        LinkedHashSet<Integer> exclusive = new LinkedHashSet<>();
        LinkedHashSet<Integer> duplicate = new LinkedHashSet<>();
        for (int i=0; i<myArray.length; i++) {
            if (exclusive.contains(myArray[i])) {
                duplicate.add(myArray[i]);
            } else {
                exclusive.add(myArray[i]);
            }
        }
        System.out.println(duplicate);
    }
}