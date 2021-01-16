package DataStructures.Arrays;
import java.util.Arrays;

/*
* Given an array, rotate the array to the right by k steps, where k is non-negative.
* Example 1:
    * Input: nums = [1,2,3,4,5,6,7], k = 3
    * Output: [5,6,7,1,2,3,4]
    * Explanation:
        * rotate 1 steps to the right: [7,1,2,3,4,5,6]
        * rotate 2 steps to the right: [6,7,1,2,3,4,5]
        * rotate 3 steps to the right: [5,6,7,1,2,3,4]
* Example 2:
    * Input: nums = [-1,-100,3,99], k = 2
    * Output: [3,99,-1,-100]
    * Explanation:
        * rotate 1 steps to the right: [99,-1,-100,3]
        * rotate 2 steps to the right: [3,99,-1,-100]

 */
public class ArrayRotation {
    /**
     * Rotates an array k times at the end
     * @param array
     * @param k
     * @return array
     */
   public static int[] rotateArray(int[] array, int k)
   {
       if(array.length<2 || k==0)
       {
           return array;
       }
       k=k % array.length;
       reverseArray(array,0,array.length-1);
       reverseArray(array,0,k-1);
       reverseArray(array,k,array.length-1);
       return array;
   }

    /**
     * Reverse the elements in an array
     * @param array
     * @param start
     * @param end
     * @return array
     */
   private static int[] reverseArray(int[] array, int start, int end)
   {
       while(start<end)
       {
           int temp=array[start];
           array[start]=array[end];
           array[end]=temp;
           start++;
           end--;
       }
       return array;
   }
   public static void main(String[] args)
   {
       int[] array={1,2,3,4};
       int result[]=rotateArray(array,2);
       for(int i: result)
       {
           System.out.println(i+" ");
       }
   }
}
