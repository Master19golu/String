package org.String;

public class getFileExtension {
    public static String getFileExtension(String filename){
        int lastDotindex = filename.lastIndexOf('.');
        if(lastDotindex ==-1){
            return " "; //no extension found
        }
        return filename.substring(lastDotindex +1);
    }

    public static void main(String []args){
        String filename ="document.pdf";
        System.out.println(getFileExtension(filename));
    }
}
