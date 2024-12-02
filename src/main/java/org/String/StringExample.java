package org.String;

public class StringExample {
    public static void main(String[] args) {
        String str1 = "Hello, world";
        String str2 = "Hello, world";
        System.out.println("str1:" + str1);
        System.out.println("str2:" + str2);
   //check if str1 and str2 reference the sam eobject
        System.out.println("Are str1 and str2 the same object? " +(str1 == str2));
    }
}
