package setinterface;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
    // Method to find intersection
    public static <T> Set<Integer> intersection(Set<Integer> hs, Set<Integer> hs2){
        Set<Integer> intersectionSet = new HashSet<>();
        for(Integer ele: hs)
        {
            if(hs2.contains(ele)){
                intersectionSet.add(ele);
            }
        }
        return intersectionSet;
    }
    // Method to find union
    public static <T> Set<Integer> union(Set<Integer> hs, Set<Integer> hs2){
        Set<Integer> unionSet = new HashSet<>();
        unionSet.addAll(hs);
        unionSet.addAll(hs2);
        return unionSet;
    }
    // Method to find symmetric difference
    public static <T> void symmetricDifference(Set<Integer> hs, Set<Integer> hs2){
        Set<Integer> symmetric = new HashSet<>();
        Set<Integer> set1 = union(hs,hs2);
        Set<Integer> set2 = intersection(hs,hs2);

        for(Integer ele: set1){
            if(!set2.contains(ele)){
                symmetric.add(ele);
            }
        }

        System.out.println(symmetric);
    }
    public static void main(String[] args) {
        // Set 1
        Set<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);

        // Set 2
        Set<Integer> hs2 = new HashSet<>();
        hs2.add(3);
        hs2.add(4);
        hs2.add(5);

        // Calling method to print output
        symmetricDifference(hs,hs2);
    }
}
