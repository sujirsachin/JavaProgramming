package DataStructures.Arrays;
/* Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

*Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.

*Example 1:

    *Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    *Output: 6
    *Explanation: [4,-1,2,1] has the largest sum = 6.
*Example 2:

    *Input: nums = [1]
    *Output: 1
*Example 3:

    *Input: nums = [0]
    *Output: 0
*Example 4:

    *Input: nums = [-1]
    *Output: -1
*Example 5:

    *Input: nums = [-2147483647]
    *Output: -2147483647

 */
public class MaximumSubarray {
    public static int maximumSubArraySum(int[] array)
    {
        if(array.length<1)
        {
            return 0;
        }
        if(array.length==1)
        {
            return array[0];
        }
        int sum=array[0];
        int j=0;
        String result="";
        for(int i=0;i<array.length;i++)
        {
            j=i;
            int tempSum=0;
            String tempResult="";
            while(j<array.length)
            {
                tempSum=tempSum+array[j];
                tempResult+=Integer.toString(array[j])+" ";
                j++;
                if(tempSum>sum)
                {
                    sum=tempSum;
                    result=tempResult;
                }
            }
        }
        System.out.println(result);
        return sum;
    }
    public static int maximumSubArraySum2(int[] nums)
    {
        int n = nums.length;
        int currSum = nums[0], maxSum = nums[0];

        for(int i = 1; i < n; ++i) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
    public static void main(String args[])
    {
        int[] array={10,20,31,-31};
        System.out.println(maximumSubArraySum(array));
        System.out.println(maximumSubArraySum2(array));
    }
}
