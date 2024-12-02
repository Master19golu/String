package org.String;

public class Stringmethods {
    public static void main(String []args){

     //equal() method instead of ==
     String str1 = new String("Hello");
     String str2 = new String("Hello");

     boolean isEqual =str1.equals(str2);
     System.out.println(isEqual);

     //string fromatting
        String name ="john";
        int age = 30;
        String formattedstring = String.format("Name: %s, Age: %d" ,name ,age);
        System.out.println(formattedstring);


        String str= " Hello World";
        System.out.println("trimmed String is: "+str.trim());

    }
}
