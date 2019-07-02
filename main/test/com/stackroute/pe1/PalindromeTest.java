package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome ob;
    @Before
    public void setUp() throws Exception {
        ob=new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }


    @Test
    public void givenIntegerIsPalindromeShouldReturnMessage() {
        //Act
        String result;
        result = ob.checkPalindrome(1221);
        //Assert
        assertEquals("is palindrome", result);
    }

    @Test
    public void givenIntegerIsNotPalindromeShouldReturnMessage() {
        //Act
        String result;
        result = ob.checkPalindrome(1231);
        //Assert
        assertEquals("is not palindrome", result);
    }

    @Test
    public void givenSumOfEvenDigitsGreaterThanReturnMessage()
    {
        //Act
        String result;
        result = ob.evenSum(2468642);
        //Assert
        assertEquals("and the sum of even digits is greater than 25",result);
    }
    @Test
    public void givenSumOfEvenDigitsLesserThanReturnMessage()
    {
        //Act
        String result;
        result = ob.evenSum(12321);
        //Assert
        assertEquals("and the sum of even digits is less than 25",result);

    }


}
