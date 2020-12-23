package DataStructures.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArray {
    private Object[] data;
    private int length;
    private int capacity;
    public MyArray()
    {
        this.length=0;
        this.capacity=1;
        this.data=new Object[1];
    }

    public Object get(int index) {
        return data[index];
    }
    public void push(String newElement)
    {
        if(this.length==0)
        {
            this.data[this.length] = newElement;
            this.length++;
        }
        else
        {
            Object[] tempArray=new Object[this.length+1];
            for(int i=0;i<this.data.length;i++)
            {
                tempArray[i]=this.data[i];
            }
            this.data=tempArray;
            //this.data=Arrays.copyOf(this.data,this.length+1);
            this.length++;
            this.data[this.length-1]=newElement;
        }
    }
    public void traverse()
    {
        for (int i=0;i<this.length;i++)
        {
            System.out.println(this.data[i]);
        }
    }
    public void pop()
    {
        if(this.length>0)
        {
            Object[] result=new Object[this.length-1];
            for (int i = 0, k = 0; i < this.length-1; i++)
            {
                result[k++] = this.data[i];
            }
            this.length--;
            this.data=result;
        }
    }
    public static void main(String args[])
    {
        MyArray newArray=new MyArray();
        newArray.push("1");
        newArray.push("2");
        newArray.push("3");
        newArray.push("4");
        newArray.pop();
        newArray.pop();
        newArray.push("5");
        newArray.pop();
        System.out.println("length of newArray: "+newArray.length);
        System.out.println(newArray.data.length);
        newArray.traverse();
    }
}