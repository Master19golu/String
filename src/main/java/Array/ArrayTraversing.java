package Array;

import java.util.Arrays;

public class ArrayTraversing {
    public static  void main(String []args){
        int[] numbers ={5,8,7,10};
        for (int num :numbers){
            System.out.println(num);
        }
        Arrays.sort(numbers);
    }
}
