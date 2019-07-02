package com.stackroute.pe1;

/*To return concatenated string*/
public class StringInteger{

    public static String repeatString(String str, int num)
    {
        if(str==null)
        {
            return "Null not accepted";
        }
        String substr = str.substring(str.length()-num);
        for(int i=1; i<=num; i++)
        {
            str=str + substr;
        }

        return str;

    }
}