package com.stackroute.pe4;
import java.lang.AssertionError;

public class ReverseString {
    public String reverse(String str) {

        if (str == null) {
            return null;
        }

      String[] str1=str.split(" ");
        String rev="",rev1="";
        for(int i=0;i<str1.length;i++){
            for(int j=str1[i].length()-1;j>=0;j--){
                rev=rev+str1[i].charAt(j);
            }
            rev1+=rev+" ";
            rev="";
        }

     return rev1;
   }
}
