package listinterface;

import java.util.*;

public class ReverseList {
    // Method to reverse an ArrayList manually
    public static <T> void reverseArrayList(List<T> list) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            // Swap elements
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
    // Method to reverse a LinkedList manually
    public static <T> void reverseLinkedList(LinkedList<T> list) {
        int left = 0, right = list.size() - 1;
        while (left < right) {
            // Swap elements
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        // LinkedList
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);

        // ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        System.out.println("Original LinkedList: "+ll);
        reverseLinkedList(ll);
        System.out.println("Reversed LinkedList: "+ll);

        System.out.println("Original ArrayList: "+arrayList);
        reverseArrayList(arrayList);
        System.out.println("Reversed ArrayList: "+arrayList);

    }
}
