package com.stackroute.pe4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringMatcherTest {
    private static StringMatcher stringMatcher;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        stringMatcher = new StringMatcher();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        stringMatcher = null;

    }

    @Test
    public void givenStringShouldReturnThePositionOfWordPattern(){
        String str="She sells seashells by the seashore";
        String actual=stringMatcher.stringMatches(str,"se");
        String expected="4-6\n"+
                          "10-12\n"+
                             "27-29\n";
        assertEquals(expected,actual);
    }
    @Test
    public  void givenStringShouldReturnNull() {
        String actual = stringMatcher.stringMatches(null,null);
        assertNull(actual);
    }

}