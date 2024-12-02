package Array;

import java.util.HashSet;

public class firstrepeatingelementinArray {
    public static void printfirtrepeating(int arr[]){
        int min =0;
        HashSet<Integer> set = new HashSet<>();
        for ( int i=arr.length-1;i>=0;i--){
            if(set.contains(arr[i])){
                min=i;
            }
            else
                set.add(arr[i]);
        }

        if(min !=0){
            System.out.println(" the first repeating element is "+arr[min]);
        } else
            System.out.println("There are no repeating elemeents");
    }
public static void main(String []args){
        int arr[] ={10,5,3,4,3,5,6};
        printfirtrepeating(arr);
}
}
