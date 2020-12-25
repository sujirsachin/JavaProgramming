package DataStructures.Arrays;

import java.util.HashMap;

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

    // Solution 1: Efficient for a sorted array
    public static int[] sumOfPairs(int[] nums, int sum)
        {
            if(nums.length<2)
            {
                return new int[]{};
            }
            int high=nums.length-1;
            int low=0;
            String pair="";
            while(low<high)
            {
                if(nums[high]+nums[low]==sum)
                {
                    return new int[] {low,high};
                }
                else if(nums[high]+nums[low]>sum)
                {
                    high--;

                }
                else if(nums[high]+nums[low]<sum)
                {
                    low++;
                }
            }
            return new int[] {};
        }
        // Solution 2: Brute Force solution for an unsorted array
        public static int[] sumOfPairsUnsorted(int[] nums,int target)
        {
            if(nums.length<2)
            {
                return new int[]{};
            }
            int num1=0,num2=0;
            outer: for(int i=0;i<nums.length-1;i++)
            {
                for(int j=i+1;j<nums.length;j++)
                {
                    if(nums[i]+nums[j]==target)
                    {
                        num1=i;
                        num2=j;
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
        // Solution 3: Efficient solution for an unsorted array
        public static int[] sumofPairsEfficient(int[] nums, int target)
        {
            if(nums.length<2)
            {
                return new int[]{};
            }
            HashMap<Integer,Integer> numbers=new HashMap<>();
            for(int i=0;i<nums.length;i++)
            {
                numbers.put(nums[i],i); //Adding all the numbers from the array to a hashmap
            }
            for(int i=0;i<nums.length;i++)
            {
                int complement=target-nums[i];
                if(numbers.containsKey(complement) && numbers.get(complement)!=i) // checking if the complement if present in the hashtable and the number isn't the same number
                {
                    return new int[]{i,numbers.get(complement)};
                }
            }
            return new int[]{};
        }
        // Solution 3: Efficient solution for an unsorted array- One-pass Hash Table
        public static int[] sumofPairsEfficient2(int[] nums, int target) {
            if (nums.length < 2) {
                return new int[]{};
            }
            HashMap<Integer, Integer> numbers = new HashMap<>();
            for (int i = 0; i < nums.length; i++)
            {
                int complement=target-nums[i];
                if(numbers.containsKey(complement))
                {
                    return new int[]{numbers.get(complement),i};
                }
                numbers.put(nums[i],i);
            }
            return new int[]{};
        }
        public static void main(String args[])
        {
            int[] someArray = {3,7,8,6,2,4};
            int sum=10;
            int[] result1=sumOfPairs(someArray,sum);
            int[] result2=sumOfPairsUnsorted(someArray,sum);
            int[] result3=sumofPairsEfficient(someArray,sum);
            int[] result4=sumofPairsEfficient2(someArray,sum);
            if(result1.length!=0) {
                System.out.println(result1[0] + " ," + result1[1]);
            }
            if(result2.length!=0) {
                System.out.println(result2[0] + " ," + result2[1]);
            }
            if(result3.length!=0) {
                System.out.println(result3[0] + " ," + result3[1]);
            }
            if(result4.length!=0) {
                System.out.println(result4[0] + " ," + result4[1]);
            }
        }
    }


