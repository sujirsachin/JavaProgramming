package DataStructures.Arrays;
/*
* Source: GeeksForGeeks
* Given an array of 0’s and 1’s,
 *we need to write a program to move all the 0's to one side, and
 * all the 1's to the other side.
 * Example
    *Input : arr[] = {1, 0, 1, 0, 1}
    *Output : {1, 1, 1, 0, 0}
    *Input : arr[] = {1, 0, 1, 0, 1, 1}
    *Output : {1, 1, 1, 1, 0, 0}
 */
public class MoveBinaryDigits {
    public static int[] moveZeroesAndOnes(int[] nums)
    {
        if(nums.length==0)
        {
            return new int[]{};
        }
        if(nums.length==1)
        {
            return nums;
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != 0)
            {
                nums[count++] = nums[i];
            }
        }
        while (count < nums.length)
        {
            nums[count++] = 0;
        }
        return nums;
    }
    public static void main(String args[])
    {
        int[] array2={1,0,1,0,0};
        array2=moveZeroesAndOnes(array2);
        for(int i=0;i<array2.length;i++)
        {
            System.out.print(array2[i]+ " ");
        }

    }
}
