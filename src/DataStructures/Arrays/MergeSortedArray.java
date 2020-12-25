package DataStructures.Arrays;

public class MergeSortedArray {
    public static int[] mergeSortedArrays(int[] array1, int[] array2)
    {
        int[] mergedArray=new int[array1.length+array2.length];
        int i=0,j=0,k=0,l=0;
        while(k<mergedArray.length) //iterating through the length of merged array, which is the length of array1 + the length of array2
        {
            if(i<array1.length && j<array2.length) //compare and merge until the pointer reaches the end of the smallest array
            {
                if (array1[i] < array2[j])
                {
                    mergedArray[k] = array1[i];
                    i++;
                    k++;
                }
                else
                {
                    mergedArray[k] = array2[j];
                    j++;
                    k++;
                }
            }
            else if(i==array1.length && j<array2.length) //merging remaining elements from array2 if array 2 is larger than array 1
            {
                mergedArray[k] = array2[j];
                j++;
                k++;
            }
            else if(j==array2.length && i<array1.length) //merging remaining elements from array1 if array 1 is larger than array 2
            {
                mergedArray[k] = array1[i];
                i++;
                k++;
            }
        }
        return mergedArray;
    }
    public static void main(String args[])
    {
        int[] array1={1,2,5,6,9,11};
        int[] array2={1,3,4,7};
        int[] mergedArray=mergeSortedArrays(array1,array2);
        for (int i=0;i<mergedArray.length;i++)
        {
            System.out.println(mergedArray[i]);
        }
    }
}
