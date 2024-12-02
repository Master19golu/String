package Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplicateElements {
    public static List<Integer> findduplicates(int []array){
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates = new ArrayList<>();
        for(int num: array){
            if(seen.contains((num))){
                duplicates.add(num);
            }
            else {
                seen.add(num);
            }
        }
        return duplicates;
    }

  public static void main(String []args){
        int []array ={2,3,4,5,6,6,7,7,8,8};
        System.out.println(findduplicates(array));
  }


}
