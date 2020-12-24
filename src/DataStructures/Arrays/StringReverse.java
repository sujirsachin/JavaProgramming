package DataStructures.Arrays;

import java.util.Stack;

public class StringReverse {
    public static String reverseString(String string)
    {
        String [] splitString=string.split("");
        String result="";
        for (int i=splitString.length-1;i>=0;i--)
        {
            result+=splitString[i];
        }
        return result;
    }
    public static int reverseNumber1(int number)
    {
        String string=Integer.toString(number);
        String [] splitString=string.split("");
        String result="";
        for (int i=splitString.length-1;i>=0;i--)
        {
            result+=splitString[i];
        }
        return Integer.parseInt(result);
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
    public static String reverseStringBuiltInMethod(String string)
    {
        return new StringBuilder(string).reverse().toString();
    }
    public static void main(String args[])
    {

        System.out.println(reverseString("String Reverse"));
        System.out.println("");
        System.out.println(reverseNumber1(54321));
        System.out.println("");
        System.out.println(reverseStringBuiltInMethod("String Reverse Using Built-in Function"));
        System.out.println("");
        System.out.println(reverseNumber2(19876));


    }
}
