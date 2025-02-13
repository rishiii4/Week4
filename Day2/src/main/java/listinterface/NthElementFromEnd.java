package listinterface;

import java.util.LinkedList;
import java.util.ListIterator;

public class NthElementFromEnd {
    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        ListIterator<T> first = list.listIterator();
        ListIterator<T> second = list.listIterator();

        // Move the first pointer N steps ahead
        for (int i = 0; i < n; i++) {
            if (!first.hasNext()) {
                throw new IllegalArgumentException("N is greater than the list size");
            }
            first.next();
        }

        // Move both pointers until the first pointer reaches the end
        while (first.hasNext()) {
            first.next();
            second.next();
        }

        return second.next();
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        // Adding elements in list
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        int n = 2;
        // Printing result
        System.out.println("Nth element from the end: " + findNthFromEnd(list, n));
    }
}

