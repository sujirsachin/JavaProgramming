package Sample;

public class PairSum {

    /*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

     *You may assume that each input would have exactly one solution, and you may not use the same element twice.

     *You can return the answer in any order.



     *Example 1:

     *Input: nums = [2,7,11,15], target = 9
     *Output: [0,1]
     *Output: Because nums[0] + nums[1] == 9, we return [0, 1].

     *Example 2:

     *Input: nums = [3,2,4], target = 6
     *Output: [1,2]

     *Example 3:

     *Input: nums = [3,3], target = 6
     *Output: [0,1]*/
    public static int[] sumOfPairs(int[] array, int sum)
        {
            int high=array.length-1;
            int low=0;
            String pair="";
            while(low<high)
            {
                if(array[high]+array[low]==sum)
                {
                    return new int[] {array[high],array[low]};
                }
                else if(array[high]+array[low]>sum)
                {
                    high--;

                }
                else if(array[high]+array[low]<sum)
                {
                    low++;
                }
            }
            return new int[] {};
        }
        /*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

         *You may assume that each input would have exactly one solution, and you may not use the same element twice.

         *You can return the answer in any order.



         *Example 1:

         *Input: nums = [2,7,11,15], target = 9
         *Output: [0,1]
         *Output: Because nums[0] + nums[1] == 9, we return [0, 1].

         *Example 2:

         *Input: nums = [3,2,4], target = 6
         *Output: [1,2]

         *Example 3:

         *Input: nums = [3,3], target = 6
         *Output: [0,1]*/
        public static int[] sumOfPairsUnsorted(int[] nums,int target)
        {
            int num1=0,num2=0;
            outer: for(int i=0;i<nums.length-1;i++)
            {

                for(int j=i+1;j<nums.length;j++)
                {
                    if(nums[i]+nums[j]==target)
                    {

                        num1=nums[j];
                        num2=nums[i];
                        break outer;

                    }
                    else
                    {
                        continue;
                    }
                }

            }
            return new int[] {num1,num2};
        }
        public static void main(String args[])
        {
            int[] someArray = {1,4,6,7,8,12,213};
            int sum=225;

            int[] result1=sumOfPairs(someArray,sum);
            int[] result2=sumOfPairsUnsorted(someArray,sum);
            if(result1.length!=0) {
                System.out.println(result1[0] + " ," + result1[1]);
            }
            if(result2.length!=0) {
                System.out.println(result2[0] + " ," + result2[1]);
            }
        }
    }


