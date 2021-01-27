package Problems;

public class RepeatedString
{
    static long repeatedString(String s, long n)
    {
        if(s.length()<1)
        {
            return 0;
        }
        n=Math.abs(n-s.length());
        int j=0;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
            {
                count++;
            }
        }
        for(int i=0;i<n;i++)
        {
            s+=s.charAt(i);
            if(s.charAt(i)=='a')
            {
                count++;
            }
        }
        System.out.println(s);
        return count;
    }

    public static void main(String[] args)
    {
        repeatedString("a",100);
    }
}
