/* To create and implement a HashTable using ArrayList and custom KeyValue class */
package DataStructures.HashTables;

import java.util.ArrayList;
import java.util.Arrays;

public class HashTable {
    ArrayList<KeyValue>[] data;
    int currentLength=0;
    public HashTable(int size)
    {
        data=new ArrayList[size];
        currentLength=0;
    }
    private int _hash(String key)
    {
        int hash = 0;
        for (int i = 0; i < key.length(); i++)
        {
            hash = (hash + key.codePointAt(i) * i) % data.length;
        }
        return hash;
    }
    public void set(String key, int value)
    {
        int address=_hash(key);
        if(data[address]==null)
        {
            ArrayList<KeyValue> arrayAtAddress=new ArrayList<>();
            data[address]=arrayAtAddress;
            currentLength++;
        }
        KeyValue pair=new KeyValue(key,value);
        data[address].add(pair);
    }
    public Integer get(String key)
    {
        int address=_hash(key);
        ArrayList<KeyValue> holder=data[address];
        if(holder!=null)
        {
            for(KeyValue keyValue:holder)
            {
                if (keyValue.getKey().equals(key))
                 {
                    return keyValue.getValue();
                 }
            }
        }
        return null;
    }
    public String[] keys()
    {
        ArrayList<KeyValue>[] holder=data;
        String[] keys=new String[currentLength];
        int count=0;
        for (ArrayList<KeyValue> keyValues:holder)
        {
            if (keyValues!=null)
            {
                keys[count]=keyValues.get(0).getKey();
                count++;
            }
        }
        return keys;
    }
    public static void main(String[] args)
    {
        HashTable hashTable = new HashTable(50);
        hashTable.set("grapes", 1200);
        hashTable.set("apple", 1500);
        System.out.println("value for key grapes: " + hashTable.get("grapes"));
        System.out.println("value for key apple: " + hashTable.get("apple"));
        System.out.println("list of keys: " + Arrays.toString(hashTable.keys()));
    }
}
