package Homework6.Task3;

import java.util.*;

class ChangeKeyValue {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap();
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);
        hashMap.put("D", 3);
        System.out.println((hashMap));
        System.out.println(inverse(hashMap));
    }

    public static <K, V> Map<V, Collection<K>> inverse(Map<K, V> map) {
        Map<V, Collection<K>> resultMap = new HashMap<>();

        Set<K> keys = map.keySet();
        for (K key : keys) {
            V value = map.get(key);
            resultMap.compute(value, (v, ks) -> {
                if (ks == null) {
                    ks = new HashSet<>();
                }
                ks.add(key);
                return ks;
            });
        }
        return resultMap;
    }
}
