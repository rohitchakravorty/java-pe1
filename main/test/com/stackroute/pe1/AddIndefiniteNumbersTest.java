package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddIndefiniteNumbersTest {
    AddIndefiniteNumbers ob;
    @Before
    public void setUp() throws Exception {
        ob=new AddIndefiniteNumbers();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void givenIndefiniteInputShouldReturnResult() {

        String result = ob.addNum("12 23 2 4");
        assertEquals("41",result);
    }
    @Test
    public void givenCharInputShouldReturnErrorMessage()
    {
        String result=ob.addNum("sasdasdnjansd");
        assertEquals("Character found",result);
    }
    @Test
    public void givenSpecialCharInputShouldReturnErrorMessage()
    {
        String result=ob.addNum("%@");
        assertEquals("Special Character",result);
    }

}