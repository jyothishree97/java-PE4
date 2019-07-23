package com.stackroute.pe4;

public class ReplaceLetter {
    public String replace(String str){

        if(str==null)
            return null;

        String new_str=null,new_str1=null;

                new_str = str.replace('d','f');
                new_str1=new_str.replace('l','t');


        return new_str1;
    }
}
