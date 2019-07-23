package com.stackroute.pe4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingTest {
    private static Sorting sorting;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        sorting= new Sorting();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        sorting = null;

    }

    @Test
    public void givenInputShouldReturnSortingOrderOfNames(){
        String[] str={"abhi","shekar","ramya"};
        String[] actual=sorting.sortNames(str);
        String[] expected={"abhi","ramya","shekar"};
        assertArrayEquals(expected,actual);
    }

    @Test
    public  void givenStringShouldReturnErrorMessage() {
        String[] actual = sorting.sortNames(null);
        assertNull(actual);
    }
}