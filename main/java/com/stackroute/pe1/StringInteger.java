package com.stackroute.pe1;

import java.util.Scanner;
public class StringInteger{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string and an integer: ");
        String str = sc.next();
        int num = sc.nextInt();

        String resultString = repeatString(str, num);

        System.out.println(resultString);

    }
    public static String repeatString(String str, int num) {
        String substr = str.substring(str.length()-num);
        for(int i=1; i<=num; i++)
        {
            str=str + substr;
        }

        return str;

    }
}