package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortCheckTest {
    SortCheck ob;
    @Before
    public void setUp() throws Exception {
        ob=new SortCheck();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }
    @Test
    public void givenInputShouldReturnDecreasingOrder()
    {
        //Act
        String result=ob.sortInput(234534);
        //Assert
        assertEquals("544332",result);
    }
    @Test
    public void givenInputShouldReturnEvenDigitSum()
    {
        //Act
        int result=ob.evenSum(234534);
        //Assert
        assertEquals(10,result);
    }


}