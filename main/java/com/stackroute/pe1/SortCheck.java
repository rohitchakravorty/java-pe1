package com.stackroute.pe1;

import java.util.Arrays;
import java.util.Scanner;

public class SortCheck {
    public static void main(String[] args) {
        int inputNum;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        inputNum = sc.nextInt();

        sortInput(inputNum);
        evenSum(inputNum);
    }

    public static String sortInput(int input) {
        String sortedNumber = "";

        String str = Integer.toString(input);
        char temp[] = str.toCharArray();

        Arrays.sort(temp);

        for (int i = temp.length - 1; i >= 0; i--) {
            sortedNumber = sortedNumber + temp[i];


        }


        return sortedNumber;
    }

    public static int evenSum(int input) {
        int sum = 0;
        String str = Integer.toString(input);
        char temp[] = str.toCharArray();
        Arrays.sort(temp);
        for (int i = temp.length - 1; i >= 0; i--) {
            if ((temp[i] - '0') % 2 == 0)
                sum = sum + (temp[i] - '0');
        }
        return sum;

    }
}
