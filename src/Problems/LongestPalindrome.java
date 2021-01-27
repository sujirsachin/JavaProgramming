package Problems;

import java.util.HashSet;
import java.util.Set;

/*
* Source and Problem Statement: https://leetcode.com/problems/longest-palindrome/
 */
public class LongestPalindrome
{
    static int longestPalindrome(String s)
    {
        int[] count = new int[128];
        for (char c: s.toCharArray())
            count[c]++;

        int ans = 0;
        for (int v: count) {
            ans += v / 2 * 2;
            if (ans % 2 == 0 && v % 2 == 1)
                ans++;
        }
        return ans;
    }
    public static void main(String args[])
    {
        System.out.println(longestPalindrome("abcdefaa"));
    }
}
