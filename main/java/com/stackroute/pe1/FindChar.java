package com.stackroute.pe1;

/*To determine whether a given char is lowercase,uppercase,integer or special character*/
public class FindChar {

    public  static String check(char checkAsc)
    {
        if(checkAsc>=65 && checkAsc<=90)    //Checking Upper Case using ASCII
        {
            return "Capital Letter";
        }
        else if(checkAsc>=97 && checkAsc<=122)   //Checking Lower Case using ASCII
        {
            return "Lower Case";
        }
        else if(checkAsc>=48 && checkAsc<=57)      //Checking integer using ASCII
        {
            return "Integer";
        }
        else
        {
            return "Special Character";
        }
    }
}
