package Problems;

import java.util.HashSet;

public class LongestSubString
{
    public static int getLongestSubString(String s)
    {
        if(s.length()<2)
        {
            return s.length();
        }
        HashSet<Character> characters=new HashSet<>();
        int a_pointer=0;
        int b_pointer=0;
        int max=0;
        while(b_pointer<s.length())
            if(!characters.contains(s.charAt(b_pointer)))
            {
                characters.add(s.charAt(b_pointer));
                System.out.println("Add:"+s.charAt(b_pointer));
                max=Math.max(characters.size(),max);
                b_pointer++;
            }
            else
            {
                System.out.println("Remove "+s.charAt(a_pointer));
                characters.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        return max;
    }

    public static void main(String args[])
    {
        System.out.println(getLongestSubString("abbaac"));
        System.out.println(getLongestSubString("jbpnbwwd"));
    }
}

