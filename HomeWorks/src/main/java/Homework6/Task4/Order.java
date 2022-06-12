package Homework6.Task4;

import java.util.*;

public class Order {
    public static void main(String[] args) {
        String[] order = {"Laptop", "Iphone", "Laptop", "PC", "PC"};
        System.out.println("Orders: " + Arrays.asList(order));

        Set<String> hashSet = new HashSet<>(Arrays.asList(order));
        System.out.println("HashSet: " + hashSet);
        Set<String> treeSet = new TreeSet<>(Arrays.asList(order));
        System.out.println("TreeSet: " + treeSet);

        HashSet hashSet2 = new HashSet();
        hashSet2.add("Laptop");
        hashSet2.add("iPhone");
        hashSet2.add("Laptop");
        hashSet2.add("PC");
        hashSet2.add("PC");
        System.out.println("HashSet2: " + hashSet2);

        TreeSet treeSet2 = new TreeSet();
        treeSet2.add("Laptop");
        treeSet2.add("iPhone");
        treeSet2.add("Laptop");
        treeSet2.add("PC");
        treeSet2.add("PC");
        System.out.println("TreeSet2: " + treeSet2);
    }
}
