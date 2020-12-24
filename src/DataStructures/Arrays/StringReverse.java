package DataStructures.Arrays;

import java.util.Stack;

public class StringReverse {
    public static void reverseString(String string)
    {
        String [] splitString=string.split("");
        String result="";
        for (int i=splitString.length-1;i>=0;i--)
        {
            System.out.println(splitString[i]);
        }
    }
    public static void reverseNumber1(int number)
    {
        String string=Integer.toString(number);
        String [] splitString=string.split("");
        String result="";
        for (int i=splitString.length-1;i>=0;i--)
        {
            System.out.println(splitString[i]);
        }
    }
    public static int reverseNumber2(int number)
    {
        int rem=0, rev=0;
        if(number==0)
        {
            return 0;
        }
        else
        {
            while(number!=0) {
                rem = number % 10;
                rev = rev * 10 + rem;
                number = number / 10;
            }
        }
        return rev;
    }
    public static void main(String args[])
    {
        reverseString("Reverse a string");
        System.out.println("");
        reverseNumber1(123);
        System.out.println("");
        System.out.println(reverseNumber2(789256));
    }
}
