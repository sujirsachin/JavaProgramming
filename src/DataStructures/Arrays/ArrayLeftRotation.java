package DataStructures.Arrays;
/*
Source and Problem Statement: https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem
 */
public class ArrayLeftRotation
{
    public static int[] rotateArray(int[] array, int k)
    {
        if(array.length<2 || k==0)
        {
            return array;
        }
        k=k % array.length;
        reverseArray(array,k,array.length-1);
        reverseArray(array,0,k-1);
        reverseArray(array,0,array.length-1);
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
