/*
* Given an array find and print the first recurring character
* Example 1:
*           [2,5,1,2,3,5,1,2,4]: It should return 2
* Example 2:
*           [2,1,1,2,3,5,1,2,4]: It should return 1
* Example 3:
*           [2,3,4,5]: It should return null
* Example 4:
*          [2,5,5,2,3,5,1,2,4]: return 5 because the pairs are before 2,2
*/
package DataStructures.HashTables;

import java.util.HashSet;

public class RecurringCharacter {
    /**
     *
     * @param array
     * @return the first recurring character
     */
    public static Integer firstRecurringCharacter(int[] array)
    {
        if(array.length<1)
        {
            return null;
        }
        if(array.length<2)
        {
            return array[0];
        }
        HashSet<Integer> elemets=new HashSet<>();
        for(Integer i:array)
        {
            if(elemets.contains(i))
            {
                return i;
            }
            elemets.add(i);
        }
        return null;
    }
    /**
     *
     * @param array
     * @return the first recurring character
     */
    public static String firstRecurringCharacter(String[] array)
    {
        if(array.length<1)
        {
            return null;
        }
        if(array.length<2)
        {
            return array[0];
        }
        HashSet<String> elements=new HashSet<>();
        for(String i:array)
        {
            if(elements.contains(i))
            {
                return i;
            }
            elements.add(i);
        }
        return null;
    }
    public static void main(String[] args)
    {
        int[] array={2,5,5,2,3,5,1,2,4};
        int[] array2={2,5,9,25,3,55,1,28,4};
        String[] array3={"Recurring","Character","Using","Hash","Recurring","Recurring"};
        System.out.println(firstRecurringCharacter(array));
        System.out.println(firstRecurringCharacter(array2));
        System.out.println(firstRecurringCharacter(array3));
    }
}
