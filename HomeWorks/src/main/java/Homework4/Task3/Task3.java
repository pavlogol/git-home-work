package Homework4.Task3;
//3.	What's wrong with the following program? Fix the program called SomethingIsWrong.
//public class SomethingIsWrong {
//    public static void main(String[] args) {
//        Rectangle myRect;
//        myRect.width = 40;
//        myRect.height = 50;
//        System.out.println("myRect's area is " + myRect.area());
//    }
//}

public class Task3 {
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle();
        myRect.width = 40;
        myRect.height = 50;
        System.out.println("myRect's area is " + myRect.area());
    }

}

