package Homework6.Task1;

import java.util.HashMap;

public class Dictionary {
    public static void main(String[] args) {
        String text = "HELLO";
        HashMap<Character, Integer> dictionary = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            if (dictionary.containsKey(text.charAt(i))) {
                int counter = dictionary.get(text.charAt(i));
                dictionary.put(text.charAt(i), counter + 1);
            } else {
                dictionary.put(text.charAt(i), 1);
            }
        }
        System.out.println(dictionary);
    }
}

