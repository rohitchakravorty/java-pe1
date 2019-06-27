package com.stackroute.pe1;

public class AddIndefiniteNumbers {


        public String addNum(String input)
        {
            String[] listNum = input.split(" ");

            int sum=0,count=0;

            for(int i=0;i<listNum.length;i++)
            {
                if(Character.isLetter(listNum[i].charAt(0)))
                {
                    count=1;
                    return "Character found";
                }

                else if(listNum[i].charAt(0)>='0' && listNum[i].charAt(0)<='9')
                {
                    sum = sum + Integer.parseInt(listNum[i]);
                }
                else
                {
                    count=1;
                    return "Special Character";
                }

            }
            if(count==0)
                return Integer.toString(sum);
            else
                return null;

        }


}
