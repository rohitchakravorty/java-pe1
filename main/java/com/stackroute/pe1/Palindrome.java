package com.stackroute.pe1;

import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        num = sc.nextInt();
        checkPalindrome(num);
    }



     public static String checkPalindrome(int num) {
         int originalNum = num;
         int reverseNum = 0;
         int rem;
         while (num != 0) {
             rem = num % 10;
             reverseNum = reverseNum * 10 + rem;
             num = num / 10;
         }
         if (reverseNum == originalNum)
         {
             evenSum(originalNum);
             return "is palindrome";

         }
         else{
            return "is not palindrome";
         }
     }
     public static String evenSum(int num)
     {
            int rem,sum=0;
             while(num!=0)
             {
                 rem=num%10;
                 num=num/10;

                 if(rem%2==0)
                 {
                     sum = sum + rem;
                 }
             }
             if(sum > 25)
             {
                 return "and the sum of even digits is greater than 25";
             }
             else {
                 return "and the sum of even digits is less than 25";
             }

         }



     }




