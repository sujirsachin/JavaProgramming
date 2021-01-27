package Problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*
Source and Problem statement: https://leetcode.com/problems/palindrome-permutation/
 */
public class PalindromePermutation {
    static boolean canPermutePalindrome(String s)
    {
        if(s.length()<2)
        {
            return true;
        }
        int count=0;
        HashMap<Character, Integer> elements=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(elements.containsKey(s.charAt(i)))
            {
                char current=s.charAt(i);
                elements.put(current,(elements.get(current)+1));
            }
            else
            {
                elements.put(s.charAt(i),1);
            }
        }
        for (char key: elements.keySet())
        {
            count+=elements.get(key) % 2;
        }
        return count<=1;
    }
    static boolean canPermutePalindrome2(String s)
    {
        if(s.length()<2)
        {
            return true;
        }
        Set<Character> elements=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            if(!elements.add(s.charAt(i)))
            {
                elements.remove(s.charAt(i));
            }
        }
        return elements.size()<=1;
    }
    public static void main(String args[])
    {
        System.out.println(canPermutePalindrome("ambabmc"));
        System.out.println(canPermutePalindrome("aaabbbcc"));
    }
}
