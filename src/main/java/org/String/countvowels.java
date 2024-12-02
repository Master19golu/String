package org.String;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.awt.SystemColor.text;

public class countvowels {
    public static void main(String []args){
        String line ="Umang";
        int vowels =0;
        line = line.toLowerCase();
        for (int i=0;i<line.length();i++){
            char ch=line.charAt(i);
            if(ch=='a' || ch== 'e' ||ch=='i' ||ch=='o' ||ch=='u'){
                vowels++;
            }
        }

        System.out.println("Vowels: "+vowels);
    }

    public static SystemColor readFileAsString() throws IOException {
        String txt =" ";
        try{
            txt = new String(Files.readAllBytes(Paths.get("src/main/resources/Inputfile.txt")));

        }catch (IOException e){
            e.printStackTrace();
        }
        String s = String.valueOf(text);
        return text;
    }
}
