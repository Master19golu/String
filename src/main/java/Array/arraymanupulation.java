package Array;

import java.util.Arrays;

public class arraymanupulation {
    public static void main(String[]args){

        int[] originalarray = {1,2,3};
        int []newArray = Arrays.copyOf(originalarray,originalarray.length+1);
        newArray[newArray.length-1]=4;
        for(int num: newArray){
            System.out.println(Arrays.toString(newArray));
        }
    }
}
