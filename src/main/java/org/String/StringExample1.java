package org.String;

public class StringExample1 {
    public static void main(String []args){
        String str1 = new String("Hello, world");
        String str2 =new String(("Hello, world"));
        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);
        //check if the str1 and str2 reference the same object
        System.out.println("Are str1 and str2 the same object? "+(str1 == str2));
    }
}
