package Problems;
/*
Source and Problem statement: https://www.hackerrank.com/challenges/2d-array/problem
 */
public class HourGlass
{
    static int maxHourGlassSum(int[][] arr)
    {
        int row=arr.length;
        int column=arr[0].length;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<row-2;i++)
        {
            for(int j=0;j<column-2;j++)
            {
                int tempSum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                System.out.print(tempSum+" ");
                maxSum=Math.max(tempSum,maxSum);
            }
            System.out.println("");
        }
        return maxSum;
    }
    public static void main(String args[])
    {
        int[][]array={{1,1,1,0,0,0},
                {0,1,0,0,0,0},{1,1,1,0,0,0},{0,0,2,4,4,0},
                {0,0,0,2,0,0},{0,0,1,2,4,0}};
        System.out.println(maxHourGlassSum(array));
    }
}
