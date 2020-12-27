package DataStructures.Arrays;
/*Given an array of integers, find if the array contains any duplicates.

 *Your function should return true if any value appears at least twice in the array,
 *and it should return false if every element is distinct.

 *Example 1:

    *Input: [1,2,3,1]
    *Output: true
 *Example 2:

    *Input: [1,2,3,4]
    *Output: false
 *Example 3:

    *Input: [1,1,1,3,3,4,3,2,4,2]
    *Output: true
 */
import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicateElements {
    // Solution 1: Brute-Force solution
    public static boolean containsDuplicates(int[] nums)
    {
        if(nums.length<2)
        {
            return false;
        }
        for(int i=0;i<nums.length-1;i++)
        {
            int j=i+1;
            while(j<nums.length)
            {
                if(nums[i]==nums[j])
                {
                    return true;
                }
                j++;
            }
        }
        return false;
    }
    // Solution 2: Using Hashmap to keep an account of elements visited. Worst Case O(n)
    public static boolean containsDuplicatesEfficient(int[] nums)
    {
        if(nums.length<2)
        {
            return false;
        }
        HashMap<Integer,Integer> elements=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(elements.containsValue(nums[i]))
            {
                return true;
            }
            elements.put(i,nums[i]);
        }
        return false;
    }
    // Solution 3: Using HashSet to keep an account of elements visited. Worst Case O(n)
    public static boolean containsDuplicatesEfficient2(int[] nums)
    {
        if(nums.length<2)
        {
            return false;
        }
        HashSet<Integer> elements=new HashSet<>();
        for(int i:nums)
        {
            if (!elements.add(i))
                return true;
        }
        return false;
    }
    public static void main(String args[])
    {
        int[] array={1,2,3,4,1};
        System.out.println(containsDuplicates(array));
        System.out.println(containsDuplicatesEfficient(array));
        System.out.println(containsDuplicatesEfficient2(array));
    }
}
