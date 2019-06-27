package com.stackroute.pe1;

import java.lang.String;
import java.util.Scanner;
public class VowelCheck {
    public static void main(String[] args)
    {
        String word;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        word=sc.nextLine();
        checkVowel(word);

    }
    public static String checkVowel(String word)
    {
        int len=word.length(),i=0;
        word=word.toLowerCase();
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
