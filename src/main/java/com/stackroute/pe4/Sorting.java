package com.stackroute.pe4;

public class Sorting {
    public String[] sortNames(String[] str){
        String temp="";
        if(str==null)
            return null;

        for (int i = 0; i < 2; i++)
        {
            if (str[i].compareTo(str[i+1])>0)
                {
                    temp = str[i];
                    str[i] = str[i+1];
                    str[i+1] = temp;
                }
            }

        return str;
    }
}
