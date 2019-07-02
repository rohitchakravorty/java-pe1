package com.stackroute.pe1;

import java.util.Arrays;
import java.util.Scanner;

/*Sort the integer input in non-decreasing order and add sum of even digits*/

public class SortCheck {
    public static boolean isNumeric(String strNum)    //To validate the input
    {
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }

    public static String sortInput(int input)          //To sort the given integer input
    {
        String sortedNumber = "";

        String str = Integer.toString(input);
        char temp[] = str.toCharArray();

        Arrays.sort(temp);

        for (int i = temp.length - 1; i >= 0; i--) {
            sortedNumber = sortedNumber + temp[i];


        }


        return sortedNumber;
    }

    public static int evenSum(int input)                //To add the even digits
    {
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
