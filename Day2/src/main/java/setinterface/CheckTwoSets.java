package setinterface;

import java.util.HashSet;
import java.util.Set;

public class CheckTwoSets {

    public static void main(String[] args) {
        // Set 1
        Set<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);

        // Set 2
        Set<Integer> hs2 = new HashSet<>();
        hs2.add(1);
        hs2.add(2);
        hs2.add(3);
        hs2.add(4);

        // Checking if sets are equal
        if(hs.equals(hs2)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
