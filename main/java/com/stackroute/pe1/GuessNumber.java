package com.stackroute.pe1;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int target=52;
        int inputNum;
        System.out.println("Guess the number[1-100]");
        inputNum=sc.nextInt();
        guess(inputNum,target);

    }
    public static String guess(int num,int target)
    {
        if(num>target)
        {
            return "Number guessed is more than original number";
        }
        else if(num<target)
        {
            return "Number guessed is lesser than original number";
        }
        else if(num==target)
        {
            return "Numbers matched";
        }
        else if(num>100)
        {
            return "Output of range";
        }
        return "Invalid";
    }
}
