package com.stackroute.pe4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.*;

public class ReverseStringTest {
    private static ReverseString reverseString;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        reverseString = new ReverseString();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        reverseString = null;

    }

    @Test
    public void givenStringReturnTheReverseOfTheString() {
        String str="a quick brown fox jumps over the lazy dog";
        String actual=reverseString.reverse(str);
        String expected="a kciuq nworb xof spmuj revo eht yzal god ";
        assertEquals(expected,actual);
    }


    @Test
    public  void givenStringShouldReturnErrorMessage(){
        String actual=reverseString.reverse(null);
        assertNull(actual);

    }
}