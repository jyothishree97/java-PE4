package com.stackroute.pe4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionTest {
    private static RegularExpression regularExpression;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        regularExpression = new RegularExpression();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        regularExpression = null;

    }

    @Test
    public void givenStringShouldReturnTrue() {
        String str = "This is Harry";
        boolean actual = regularExpression.isMatch(str);
        boolean expected = true;
        assertEquals(expected, actual);
    }

    @Test
    public void givenStringShouldReturnTrueValue() {
        String str = "This is Henry";
        boolean actual = regularExpression.isMatch(str);
        boolean expected = false;
        assertEquals(expected, actual);
    }

    }