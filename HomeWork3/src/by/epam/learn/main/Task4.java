package by.epam.learn.main;

//Write a Java program to sum values of an array.
//        Test Data:
//        [5,6,7,12,-5,32,43]
//        Expected Output : 100

public class Task4 {
    public static void main(String[] args) {
        int myArray[] = {5,6,7,12,-5,32,43};
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        System.out.println(sum);
    }
}