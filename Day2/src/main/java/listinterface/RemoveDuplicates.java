package listinterface;

import java.util.*;

public class RemoveDuplicates {
    public static <T> List<T> removeDuplicates(List<T> list) {
        Set<T> set = new HashSet<>();
        // List to store unique elements in order
        List<T> result = new ArrayList<>();

        for (T item : list) {
            // Add only if the element is not already in the set
            if (set.add(item)) {
                result.add(item);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 2, 2, 3, 4);

        List<Integer> uniqueNumbers = removeDuplicates(numbers);

        // Printing output
        System.out.println("List after removing duplicates: " + uniqueNumbers);
    }
}

