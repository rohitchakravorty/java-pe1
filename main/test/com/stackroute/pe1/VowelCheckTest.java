package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelCheckTest {
    VowelCheck ob;
    @Before
    public void setUp() throws Exception {
        ob=new VowelCheck();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }
    @Test
    public void givenInputIsValidShouldDisplayResult()
    {
        //Act
        String result=ob.checkVowel("p");
        //Assert
        assertEquals("consonent",result);
    }
    @Test
    public void givenInputIsInvalidShouldDisplayResult()
    {
        //Act
        String result=ob.checkVowel("a");
        //Assert
        assertEquals("vowel",result);
    }

}