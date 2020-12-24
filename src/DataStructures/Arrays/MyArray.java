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
        if(this.length!=0)
        {
            return data[index];
        }
        return null;
    }
    public void push(Object newElement)
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
    public void delete(int index)
    {
        shiftItems(index);
    }
    public void shiftItems(int index)
    {
        for(int i=index;i<length-1;i++)
        {
            this.data[i]=data[i+1];
        }
        pop();
    }
    public void traverse()
    {
        if(this.length==0)
        {
            System.out.println("Empty Array");
        }
        for (int i=0;i<this.length;i++)
        {
            System.out.println(this.data[i]);
        }
    }
    public void clear()
    {
        Object[] tempArray=new Object[0];
        this.data=tempArray;
        this.length=0;
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
        newArray.traverse();
        newArray.push('a');
        newArray.delete(0);
        System.out.println("length of newArray: "+newArray.length);
        newArray.traverse();
        newArray.clear();

    }
}