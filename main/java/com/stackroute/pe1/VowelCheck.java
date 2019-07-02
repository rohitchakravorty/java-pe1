package com.stackroute.pe1;

import java.lang.String;
import java.util.Scanner;
/*To check vowel and consonent*/
public class VowelCheck {

    public static String checkVowel(String word)
    {
        int len=word.length(),i=0;
        word=word.toLowerCase(); //Converting the string to lowercase.
        while(i<len)
        {
            char check=word.charAt(i);
            if(word.charAt(i)=='a' || word.charAt(i)=='e' || word.charAt(i)=='i' || word.charAt(i)=='o' || word.charAt(i)=='u')
            {
                i++;
                return "vowel";
            }
            else
            {
                i++;
                return "consonent";
            }

        }
        return "invalid";
    }
}
