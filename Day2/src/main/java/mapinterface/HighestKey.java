package mapinterface;

import java.util.Map;
import java.util.HashMap;

public class HighestKey {

    public static String findKeyWithMaxValue(Map<String, Integer> map) {
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        // Iterate through the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        return maxKey;
    }
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        // Find key with max value
        String maxKey = findKeyWithMaxValue(map);
        System.out.println("Key with the highest value: " + maxKey);
    }
}

