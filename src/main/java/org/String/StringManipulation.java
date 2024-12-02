package org.String;

public class StringManipulation {
    public static void main(String []args){
        //strings are immutable
     String str3 ="java";
     str3.concat("oops");
     System.out.println(str3);

     //the result shoudl be assigned to a new reference variable or same varialble can be resued
        String concat = str3.concat("value2");
        System.out.println(concat); //value1 value2

        //string methods
        String str ="abcdefgghjik";

        //charat
        System.out.println(str.charAt(2));

        //concat (String param String)
        System.out.println(str.concat("lmn"));

        System.out.println("ABC" .equalsIgnoreCase("abc")); //true

        System.out.println("ABCDEFGHRU".length());

        //replace
        System.out.println("01227673762723".replace('0','4'));

        //replace (char sequence paramCharsequence1 , charsequence
        System.out.println("012301230123".replace("01","45"));

        //All character from index paramint
        //String substring(int paramInt)
        System.out.println("abcdefghijk".substring(3));

        //all characters from the index 3 to 6
        System.out.println("abcdefghikj".substring(3,7));

        System.out.println("ABCDEFGHIJKL".toLowerCase());

        System.out.println("abcdefghikjl".toUpperCase());

        System.out.println("abcdefghijklm".toString());

        System.out.println(" abcdef".trim());

    }}
