package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumCheckTest {
    NumCheck ob;
    @Before
    public void setUp() throws Exception {
        ob=new NumCheck();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }
    @Test
    public void givenIntegerIsValidAndOdd()
    {
        //Act
        String result=ob.numCheck(23);
        //Assert
        assertEquals("Tom",result);
    }
    @Test
    public void givenIntegerIsValidAndEven()
    {
        //Act
        String result=ob.numCheck(24 );
        //Assert
        assertEquals("Jerry",result);
    }
    @Test
    public void givenIntegerIsInvalid()
    {
        //Act
        String result=ob.numCheck(1);
        //Assert
        assertEquals("Invalid Input",result);
    }
    @Test
    public void givenNotIntegerShouldReturErrorMessage()
    {
        boolean result=ob.isNumeric("abcd");
        assertEquals(false,result);
    }


}