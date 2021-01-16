package Problems;

public class FibonacciSequence {
    public static int findFib(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1 || n==2)
        {
            return 1;
        }
        int[] sequence=new int[n];
        sequence[0]=1;
        sequence[1]=1;
        for(int i=2;i<n;i++)
        {
            sequence[i]=sequence[i-1]+sequence[i-2];
        }
    return sequence[n-1];
    }

    /**
     * Efficient, with better space complexity
     * @param n
     * @return fibonacci sequence at n
     */
    public static int findFib2(int n)
    {
        if(n==0)
        {
            return 0;
        }
        if(n==1 || n==2)
        {
            return 1;
        }
        int[] sequence=new int[3];
        sequence[0]=1;
        sequence[1]=1;
        int temp=0;
        for(int i=2;i<n;i++)
        {
            temp=sequence[1];
            sequence[1]=sequence[0]+sequence[1];
            sequence[0]=temp;
        }
        return sequence[1];
    }
    public static void main(String args[])
    {
        System.out.println(findFib(6));
        System.out.println(findFib2(6));
    }
}
