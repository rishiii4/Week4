package listinterface;

import java.util.*;

public class RotateList {
    public static <T> void rotate(List<T> list, int positions) {
        int size = list.size();
        positions = positions % size; // Handle cases where positions > size

        // Create a rotated version using sub lists
        List<T> rotated = new ArrayList<>(list.subList(positions, size));
        rotated.addAll(list.subList(0, positions));

        // Copy back the rotated elements to the original list
        list.clear();
        list.addAll(rotated);
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        int rotateBy = 2;

        // Printing original list
        System.out.println("Original List: " + numbers);
        rotate(numbers, rotateBy);
        // Printing rotated list
        System.out.println("Rotated List: " + numbers);
    }
}

