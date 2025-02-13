package setinterface;

import java.util.*;

public class ConvertSetToList {
    public static void main(String[] args) {
        // Set declaration
        Set<Integer> hs = new HashSet<>();
        // Adding elements in Set
        hs.add(5);
        hs.add(3);
        hs.add(9);
        hs.add(1);
        hs.add(99);

        System.out.println(hs);

        // List declaration
        List<Integer> list = new ArrayList<>();

        // Adding elements in list in sorted manner
        for (Integer ele: hs) {
            boolean flag = true;
            for (int j = 0; j < list.size(); j++) {
                if(ele < list.get(j)){
                    list.add(j,ele);
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.add(ele);
            }
        }

        // Printing sorted list
        System.out.println(list);


    }
}
