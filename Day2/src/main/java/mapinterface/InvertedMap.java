package mapinterface;

import java.util.*;

public class InvertedMap {
    public static void main(String[] args) {
        // Original Map<K, V>
        Map<String, Integer> originalMap = new HashMap<>();
        originalMap.put("A", 1);
        originalMap.put("B", 2);
        originalMap.put("C", 1);

        // Inverted Map<V, List<K>>
        Map<Integer, List<String>> invertedMap = new HashMap<>();

        for (Map.Entry<String, Integer> entry : originalMap.entrySet()) {
            Integer value = entry.getValue();
            String key = entry.getKey();

            // If value already exists, add key to its list
            invertedMap.computeIfAbsent(value, k -> new ArrayList<>()).add(key);
        }

        // Display the inverted map
        System.out.println("Inverted Map: " + invertedMap);
    }
}

