package com.stackroute.pe1;

/*To print given statements according to the condition*/
public class NumCheck {

    public static boolean isNumeric(String strNum)    //To validate the input
    {
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }
    public static String numCheck(int num)  //Check number
    {
        if(num>20 && num<30)
        {
            if(num%2==0) {
                return "Jerry";
            }
            else{
                return "Tom";
            }
        }
        return "Invalid Input";
    }
}

