package org.String;

public class StringImmutabilityExample {
    public static void main(String []args){

        //create a string object
        String originalString ="Hello";
        System.out.println("Original String:" +originalString);

        //attempt to modify the string
        String modifiedString = originalString.concat("world");
        System.out.println("Modified String: "+modifiedString);

        //original String remains unchanged
         System.out.println("Original String modification attempt: "+originalString);
    }
}
