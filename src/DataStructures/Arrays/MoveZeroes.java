package DataStructures.Arrays;
/* Given an array nums, write a function to move all 0's to the end of it
 *while maintaining the relative order of the non-zero elements.
 * Example:
    *Input: [0,1,0,3,12]
    *Output: [1,3,12,0,0]
 *Note:
    *You must do this in-place without making a copy of the array.
    *Minimize the total number of operations.
 */
public class MoveZeroes {
    public static int[] moveZeroes(int[] nums)
    {
        if(nums.length==0)
        {
            return new int[]{};
        }
        if(nums.length==1)
        {
            return nums;
        }
        int count=0;
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
        int[] array={0,1,0,3,12};
        array=moveZeroes(array);
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+ " ");
        }
    }

}
