package Homework4.Task1;

//Write a Java program to concatenate a given string to the end of another string. And remove all `P` or `p` characters.
//        Test Data:
//        String 1: PHP Exercises and
//        String 2: Python Exercises
//        Expected output:
//        The concatenated string with replacements: H Exercises and ython Exercises


public class Task1 {
     public static void main(String[] args){
         String s1 = "PHP Exercises and";
         String s2 = "Python Exercises";
         String concat = s1+" "+s2;
         String removeP =concat.replaceAll("[p|P]", "");
         System.out.println("The concatenated string with replacements: " + removeP);
     }
}
