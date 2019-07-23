package com.stackroute.pe4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceLetterTest {
    private static ReplaceLetter replaceLetter;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        replaceLetter = new ReplaceLetter();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        replaceLetter = null;

    }

    @Test
    public void givenStringReturnReplacedValueOfLetter() {
        String str = "daily dry";
        String actual = replaceLetter.replace(str);
        String expected = "faity fry";
        assertEquals(expected, actual);
    }
    @Test
    public  void givenStringShouldReturnNull() {
        String actual = replaceLetter.replace(null);
        assertNull(actual);
    }
}
