package org.String;

public class SubstringCountOccurences {
    public static int CountOccurences(String s, String sub){
        int count =0;
        int index=0;

        while((index = s.indexOf(sub, index))!=-1){
            count++;
            index +=sub.length();
        }
        return count;
    }

    public static int CountOccurences2(String s, String sub){
        String split[]=s.split(sub, -1);
        int count = split.length-1;
        return count;
    }


    public static void main (String[]args){
        String s ="Hello. World! World";
        String sub = "World";
        System.out.println(CountOccurences(s,sub));
        System.out.println(CountOccurences2(s,sub));
    }
}
