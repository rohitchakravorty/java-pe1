package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuessNumberTest {
    GuessNumber ob;
    @Before
    public void setUp() throws Exception {
        ob=new GuessNumber();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void givenIntGreaterThanTarget() {

        //Act
        String result = ob.guess(72,52);
        //Assert
        assertEquals("Number guessed is more than original number", result);
    }
    @Test
    public void givenIntLessThanTarget() {
        //Act
        String result = ob.guess(23,52);
        //Assert
        assertEquals("Number guessed is lesser than original number", result);
    }
    @Test
    public void givenIntEqualsTarget() {
        //Act
        String result = ob.guess(52,52);
        //Assert
        assertEquals("Numbers matched", result);
    }


}