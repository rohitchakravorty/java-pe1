package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
    ReverseString ob;
    @Before
    public void setUp() throws Exception {
        ob=new ReverseString();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }
    @Test
    public void givenStringShouldReturnReverseString() {
        //Act
        String result = ob.stringReverse("hello");
        //Assert
        assertEquals("olleh", result);
    }
    @Test
    public void givenNullShouldReturnErrorMessage() {
        //Act
        String result = ob.stringReverse(null);
        //Assert
        assertEquals("Null not accepted", result);
    }

}