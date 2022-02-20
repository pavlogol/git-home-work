package Homework4.Task2;

//Design such Java class with name Computer and such properties as:
//        -	Brand
//        -	Screen size
//        -	Number of cores
//        -	Type (laptop,desktop,etc.)
//        •	Make `Brand` and `Screen size` properties required in order to create an object(instance).
//        •	Create two auxiliary object of Computer class.


public class Computer {
     private String brand;
     private double screenSize;
     private int cores;
     private String type;

    public Computer(String brand, double screenSize)    {
        this.brand = brand;
        this.screenSize = screenSize;
        this.cores = 8;
        this.type = "laptop";
    }

    public Computer(String brand, double screenSize, int cores, String type) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.cores = cores;
        this.type = type;
    }

    void print(){
        System.out.println("Brand: "+ this.brand + " Screen size: " + this.screenSize + "\" Cores: " +  this.cores + " Type: " + this.type);
    }
}
