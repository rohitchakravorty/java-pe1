package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FindCharTest {
    FindChar ob;
    @Before
    public void setUp() throws Exception {
        ob=new FindChar();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }
   @Test
    public void givenIntShouldGiveResult() {
        //Act
        String result = ob.check('2');
        //Assert
        assertEquals("Integer", result);
    }
    @Test
    public void givenLowerCaseShouldGiveResult() {

        //Act
        String result = ob.check('a');
        //Assert
        assertEquals("Lower Case", result);
    }
    @Test
    public void givenUpperCaseShouldGiveResult() {
        //Act
        String result = ob.check('A');
        //Assert
        assertEquals("Capital Letter", result);
    }


}