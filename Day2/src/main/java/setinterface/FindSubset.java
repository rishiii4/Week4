package setinterface;

import java.util.HashSet;
import java.util.Set;

public class FindSubset {
    public static <T> boolean findSubset(Set<T> set1, Set<T> set2){
        for(T num: set2){
            boolean found = false;
            for(T ele: set1){
                if(num.equals(ele)){
                    found = true;
                    break;
                }
            }
            if(!found){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        // Set 1
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        // Set 2
        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(3);

        // Checking if set2 is subset of set1
        boolean isSubset = findSubset(set1,set2);
        System.out.println(isSubset);
    }
}
