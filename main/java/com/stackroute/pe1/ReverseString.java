package com.stackroute.pe1;

/*To reverse a string */
public class ReverseString {


    public static String stringReverse(String str)
    {
        if(str==null)    //Checking if the given string is null
        {
            return "Null not accepted";
        }
        String reverse = "";
        for(int i=str.length()-1; i>=0; i--) {
            reverse = reverse + str.charAt(i);
        }

        return reverse;

    }
}
