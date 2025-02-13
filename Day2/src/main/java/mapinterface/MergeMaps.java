package mapinterface;

import java.util.HashMap;
import java.util.Map;

public class MergeMaps {

    // Method declaration for merging maps
    private static HashMap<String, Integer> getMergedMap(HashMap<String, Integer> map1, HashMap<String, Integer> map2) {
        HashMap<String, Integer> result = new HashMap<>(map1);

        // Adding the value of common keys
        for(Map.Entry<String, Integer> entry : map2.entrySet()) {
            if(result.containsKey(entry.getKey())) {
                result.put(entry.getKey(), entry.getValue() + result.get(entry.getKey()));
            } else result.put(entry.getKey(), entry.getValue());
        }

        // Returning the result
        return result;
    }
    public static void main(String[] args) {
        // Declaring the hashmaps
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        map1.put("D", 4);

        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("B", 5);
        map2.put("C", 6);
        map2.put("D", 7);
        map2.put("E", 8);

        // Method invocation for merging
        HashMap<String, Integer> result = getMergedMap(map1, map2);

        // Printing the result
        for(Map.Entry<String, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
