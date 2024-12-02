package Array;

public class missignnumber {
    public static int findmissingNumber(int[]array , int n){
        int sum = n*(n+1)/2;
        int s2= 0;
        for (int i=0;i<n-1;i++){
            s2+=array[i];
        }
        int missingNum = sum-s2;
        return missingNum;
    }

    public static void main(String []args){
        int array[] ={1,2,3,4,6,7,8};
        //size of array
        int n= 8;
        System.out.println(findmissingNumber(array,n));
    }
}
