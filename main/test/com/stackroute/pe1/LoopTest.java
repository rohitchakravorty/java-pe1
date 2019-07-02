package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoopTest {
    Loop ob;
    @Before
    public void setUp() throws Exception {
        ob=new Loop();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }
    @Test
    public void givenIntergerShouldReturnPattern() {
        //Act
        String result = ob.pattern(2);
        //Assert
        assertEquals(" 1 2 2", result);
    }
    @Test
    public void givenNotIntegerShouldReturErrorMessage()
    {
        boolean result=ob.isNumeric("abcd");
        assertEquals(false,result);
    }


}