package org.String;

public class getsubdomain {
    public static String getSubdomain(String url){
     int start = url.indexOf("://")+3;
     System.out.println(start);
     int end = url.indexOf('.',start);
     System.out.println(end);
     return url.substring(start,end);

    }

    public static void main(String []args){
        String url ="https://subdomain.example.com";
        System.out.println(getSubdomain(url));
    }
}
