package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringIntegerTest {
    StringInteger ob;
    @Before
    public void setUp() throws Exception {
        ob=new StringInteger();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }
    @Test
    public void givenStringAndIntegerReturnNewString() {
        //Act
        String result = ob.repeatString("hello",2);
        //Assert
        assertEquals("hellololo", result);
    }
    @Test
    public void givenNullShouldReturnErrorMessage() {
        //Act
        String result = ob.repeatString(null,2);
        //Assert
        assertEquals("Null not accepted", result);
    }

}