package Homework4.Task4;
//4.	Given the following class, called NumberHolder, write some code that creates an instance of the class, initializes its two member variables, and then displays the value of each member variable.
//public class NumberHolder {
//    public int anInt;
//    public float aFloat;
//}

public class NumberHolderDisplay {
    public static void main(String[] args) {
        NumberHolder nh = new NumberHolder();
        nh.anInt = 123;
        nh.aFloat = 2.3f;
        System.out.println(nh.anInt);
        System.out.println(nh.aFloat);
    }
}


