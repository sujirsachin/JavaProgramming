package Problems;

import java.util.HashMap;

public class MatchElement {
    public static boolean matchElementsArrays(int[] array1,int[] array2)
    {
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();

        if(array1.length>=array2.length)
        {
            for(int i=0;i<array1.length;i++)
            {
                if(!hashmap.containsValue(array1[i]))
                hashmap.put(i,array1[i]);
            }
            for(int i=0;i<array2.length;i++)
            {
                if(hashmap.containsValue(array2[i]))
                {
                    return true;
                }
            }
        }
        else if(array1.length<array2.length)
        {
            for(int i=0;i<array2.length;i++)
            {
                if(!hashmap.containsValue(array2[i]))
                    hashmap.put(i,array2[i]);
            }
            for(int i=0;i<array1.length;i++)
            {
                if(hashmap.containsValue(array1[i]))
                {
                    return true;
                }
            }
        }
    return false;
    }
    public static void main(String args[])
    {
        int[] array1={1,2,3,5};
        int[] array2={4,7,9,55,6};
        System.out.println(matchElementsArrays(array1,array2));
    }
}
