package Homework6.Task5;

import java.util.*;

public class Converter {
    static public void main(String[] args) {
        List<String> keys = Arrays.asList("k1", "k2", "k3");
        List<String> values = Arrays.asList("123", "456", "789");
        Map<String, String> map = map(keys, values);
        System.out.println(map);
    }

    static Map<String, String> map(List<String> keys, List<String> values) {
        try {
            if (keys.size() > values.size())
                throw new Exception("Value is not enough for map");
            if (keys.size() < values.size()) {
                throw new Exception("Key is not enough for map");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
            Map<String, String> map = new LinkedHashMap<>();
            for (int i = 0; i < keys.size(); i++) {
                if (i > values.size() - 1)
                    map.put(keys.get(i), null);
                else
                    map.put(keys.get(i), values.get(i));
            }
            return map;
        }
    }
