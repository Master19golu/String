package Array;

import java.util.HashSet;

public class commonIntwoArray {
    public static void findmissing(int a[], int b[] ,int n, int m){

        //store all elements of second array sin hash table
        HashSet<Integer> s = new HashSet<>();
        for (int i=0;i<m;i++){
            s.add(b[i]);
        }

        //print all the elements of first array
        for (int i=0;i<n;i++){
            if(!s.contains(a[i])){
                System.out.print(a[i]);
            }
        }

    }

    public static void main(String []args){
        int a[]={1,2,3,4,5,7,8,9,0};
        int b[]={2,4,6,7,12,10};
        int n= a.length;
        int m= b.length;
        findmissing(a,b,n,m);
    }
}
