package DataStructures.Arrays;

// Program to implement push, pop, traverse of an array.

public class TestArray {
    public static int[] push(int[] array,int number)
    {
        int[] result=new int[array.length+1];
        for(int i=0;i<array.length;i++)
        {
            result[i]=array[i];
        }
        result[result.length-1]=number;
        return result;
    }
    public static void traverse(int[] array)
    {
        for (int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
    public static int[] pop(int[] array,int number)
    {
        int[] result=new int[array.length-1];
        int index=indexOf(array,number);
        for (int i = 0, k = 0; i < array.length; i++)
        {
            if (i == index)
            {
                continue;
            }
            result[k++] = array[i];
        }
        return result;
    }
    public static int indexOf(int array[],int number)
    {
        int index=-1;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]==number)
            {
                index=i;
                return index;
            }
        }
       return index;
    }
    public static void main(String args[])
    {
        int[] array={1,2,3,4};
        System.out.println("Initial Array");
        traverse(array);
        array=push(array,11);
        array=push(array,12);
        array=pop(array,1);
        array=push(array,1);
        System.out.println("Final Array");
        traverse(array);

    }
}
