package Array;

import java.util.Arrays;

public class mergetwpsortedarray {

    public static int[] mergedSortedArray(int arr1[], int arr2[]) {
        //addition of two unsorted array
        //crated new array with lenght of two unsroted array
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0, k = 0, j = 0;
        int[] mergedArray = new int[arr1.length + arr2.length];
        while (i < n1) {
            mergedArray[k++] = arr1[i++];
        }
        while (j < n2) {
            mergedArray[k++] = arr2[j++];
        }
        Arrays.sort(mergedArray);

        return mergedArray;
    }

    private static boolean isSorted(int []array){
        for (int i=0;i<array.length;i++){
            return false;
        }
        return true;
    }

   public static void main (String []args){
        int arr1[]={2,4,5,7,3,5,9};
      int arr2[] ={4,5,2,6,7,8,9,0};
      int result[]= mergedSortedArray(arr1,arr2);
      System.out.println(Arrays.toString(mergedSortedArray(arr1,arr2)));
      System.out.println(isSorted(result));
   }

}
