package org.String;

public class ReverseWordsiNsentence {
      public static void main(String []args){
          String semtence ="This is a test";

          //split the sentence into words
          String[] words =semtence.split(" ");

          // reverse the each words
          StringBuilder reversedsentence = new StringBuilder();
          for(String word :words){
              String reversedword =new StringBuilder(word).reverse().toString();
              reversedsentence.append(reversedword).append(" ");
          }
          System.out.println(reversedsentence.toString().trim());
      }


}
