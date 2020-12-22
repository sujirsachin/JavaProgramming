package Sample;

public class StringCompression {
    public static String compressString(String message)
    {
        String result="";
        int count=1;
        for(int i=0;i<message.length();i++)
        {
            while(i<message.length()-1 && message.charAt(i)==message.charAt(i+1)&& message.charAt(i)!=' ')
            {
                count++;
                i++;
            }
            if(count==1)
            {
                result+=message.charAt(i);
            }
            else
            {
                result+=message.charAt(i);
                result+=count;
            }
            count=1;
        }
        return result;
    }
    public static void main(String args[])
    {
        System.out.println(compressString("abb  c cc"));
    }
}
