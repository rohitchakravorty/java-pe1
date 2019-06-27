package com.stackroute.pe1;

import java.util.Scanner;
public class NumCheck {
    public static void main(String[] args)
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        num=sc.nextInt();
        numCheck(num);
    }
    public static String numCheck(int num)
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

