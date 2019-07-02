package com.stackroute.pe1;


public class Loop{
    public static boolean isNumeric(String strNum)    //To validate the input
    {
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }

    public static String pattern(int num)  //To print the pattern
    {
        String pattern = "";
        int i=0,j=0;
        for(i=0;i<=num;i++)                 //The outer loop
        {
            for (j = 0; j < i; j++)
            {
                pattern = pattern + " "+i;
            }
        }
        return pattern;

    }

}
