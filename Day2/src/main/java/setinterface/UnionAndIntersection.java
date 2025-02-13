package setinterface;

import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection {

    // Method to find union
    public static <T> void findUnion(Set<Integer> hs, Set<Integer> hs2){
        Set<Integer> union = new HashSet<>();
        union.addAll(hs);
        union.addAll(hs2);
        System.out.println(union);
    }

    // Method to find intersection
    public static <T> void findIntersection(Set<Integer> hs, Set<Integer> hs2){
        Set<Integer> intersection = new HashSet<>();
        for(Integer ele: hs)
        {
            if(hs2.contains(ele)){
                intersection.add(ele);
            }
        }
        System.out.println(intersection);
    }



    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);


        Set<Integer> hs2 = new HashSet<>();
        hs2.add(3);
        hs2.add(4);
        hs2.add(5);

        findUnion(hs,hs2);
        findIntersection(hs,hs2);
    }
}
