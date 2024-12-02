package Array;

public class firstandlastoccurences {
    public static int[] occurence(int arr[] , int k){
        int first =-1 , last =-1;
        for (int i=0;i<arr.length-1;i++){
            if(arr[i]==k){
                if(first ==-1)
                    first =i;
                last =i;

            }
        }
        return new int[]{first,last};
    }

    public static void main(String []args){
        int arr[]={ 2,4,6,8,8,8,11,12};
        int k=8;
        int [] result = occurence(arr,k);
        System.out.println("The first and last position are " +result[0]+ " "+result[1]);
    }
}
