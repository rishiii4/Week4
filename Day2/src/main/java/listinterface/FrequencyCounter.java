package listinterface;

import java.util.*;

public class FrequencyCounter {
    public static Map<String, Integer> countFrequency(List<String> words) {
        // Map declaration
        Map<String, Integer> frequencyMap = new HashMap<>();

        // Iterating through map
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Integer> result = countFrequency(words);

        // Printing result
        System.out.println("Frequency Count: " + result);
    }
}
