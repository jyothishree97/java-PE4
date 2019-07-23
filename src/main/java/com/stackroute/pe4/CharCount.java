package com.stackroute.pe4;

public class CharCount {
    public int charOccuerence(String str) {



        int count=str.length()-str.replaceAll("a","").length();

        return count;
    }
}