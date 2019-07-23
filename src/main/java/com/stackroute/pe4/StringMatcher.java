package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMatcher {
     public String stringMatches(String str, String str1){

         if(str==null)
             return null;


         String output="";
         Pattern pattern=Pattern.compile(str1, Pattern.CASE_INSENSITIVE);
         Matcher matcher=pattern.matcher(str);

         while (matcher.find()) {
           output=output+matcher.start()+"-"+matcher.end()+"\n";

         }
         output.trim();
         return output;
     }
}


