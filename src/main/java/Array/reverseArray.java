package Array;

import java.util.Arrays;

public class reverseArray {

    public static int[]reversearray(int [] array){
        int left =0;
        int right= array.length-1;

        while(left <right){
            int temp=array[left];
            array[left]=array[right];
            array[right] = temp;
            left++;
            right--;
        }
        return array;
    }

    public static void main(String []args){
      int arr[]={2,3,4,5,6,7,8,9};
      System.out.print(Arrays.toString(reversearray(arr)));
    }
}
