package com.stackroute.pe4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharCountTest {
    private static CharCount charCount;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        charCount = new CharCount();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        charCount = null;

    }

    @Test
    public void givenStringShouldReturnNumberOfOccuerencesOfCharacter(){
        String str="java is a Java";
        int expected=5;
        int actual=charCount.charOccuerence(str);
        assertEquals(expected,actual);
    }

    @Test
    public  void givenStringShouldReturnValue(){
        String str="java";
        int expected=2;
        int actual=charCount.charOccuerence(str);
        assertEquals(expected,actual);


    }
}