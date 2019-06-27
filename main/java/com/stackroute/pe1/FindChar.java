package com.stackroute.pe1;

import java.lang.String;
import java.util.Scanner;
public class FindChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char checkChar;
        System.out.println("Enter a character");
        checkChar = sc.next().charAt(0);
        check(checkChar);

    }
    public  static String check(char check_asc)
    {
        if(check_asc>=65 && check_asc<=90)
        {
            return "Capital Letter";
        }
        else if(check_asc>=97 && check_asc<=122)
        {
            return "Lower Case";
        }
        else if(check_asc>=48 && check_asc<=57)
        {
            return "Integer";
        }
        else
        {
            return "Special Character";
        }
    }
}
