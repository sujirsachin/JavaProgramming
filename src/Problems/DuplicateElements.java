package Problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class DuplicateElements
{
    public static List<Integer> findDuplicates(int[] nums)
    {
        List<Integer> duplicates=new ArrayList<>();
        if(nums.length<2)
        {
            return duplicates;
        }
        TreeSet<Integer> unique=new TreeSet<>();
        //HashSet<Integer> unique=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(unique.contains(nums[i]))
            {
                duplicates.add(nums[i]);
            }
            unique.add(nums[i]);

        }
        return duplicates;
    }
}
