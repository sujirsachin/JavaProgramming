package DataStructures.Arrays;

public class NewYearChaos {
    static void minimumBribes(int[] q) {
        int minbribe=0;
        for(int i=0;i<q.length;i++)
        {
            if( q[i]-(i+1)>0)
            {
                if(q[i]-(i+1)>2)
                {
                    System.out.println("Too chaotic");
                }
                else
                {
                    minbribe+=q[i]-(i+1);
                }
            }
        }
        if(minbribe>0)
        {
            System.out.println(minbribe);
        }
    }
    public static void main(String args[])
    {
        int[] array={1,2,5,3,7,8,6,4};
        minimumBribes(array);
    }
}
