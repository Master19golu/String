package org.String;

public class StringBUilderExample {
    public static void main(String []args){
        String result =" ";
        //inefficient way of using +operator
        for(int i=0 ;i< 1000 ;i++){
            result+= "sometext";
        }

      //efficient way of using stringbuilder
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<10;i++){
            sb.append("some text");
        }
        System.out.println(sb);
    }
}
