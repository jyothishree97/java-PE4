package com.stackroute.pe4;

import java.util.regex.Pattern;

public class RegularExpression{
    public  boolean isMatch(String str){
        String pattern=".*Harry*.";
        boolean match= Pattern.matches(pattern,str);
        return match;
    }
}
