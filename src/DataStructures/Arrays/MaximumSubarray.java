package DataStructures.Arrays;

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
