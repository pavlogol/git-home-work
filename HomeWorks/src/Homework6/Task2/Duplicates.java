package Homework6.Task2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Duplicates {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("bbb");
        list.add("bbb");
        list.add("aaa");
        list.add("123");
        System.out.println(list);

        Set<String> set = new LinkedHashSet<>(list);
        List<String> listWithoutDuplicates = new ArrayList<>(set);
        System.out.println(listWithoutDuplicates);
    }
}
