/* To create and implement a HashTable using ArrayList and custom KeyValue class */
package DataStructures.HashTables;

import java.util.ArrayList;
import java.util.Arrays;

public class HashTable {
    private ArrayList<KeyValue>[] data;
    private int currentLength=0;
    private int totalSize;
    public HashTable(int size)
    {
        data=new ArrayList[size];
        currentLength=0;
        totalSize=0;
    }
    /**
     * Returns hash key for a key string
     * @param  key  a string key value
     * @return      the hash key for a key string
     */
    private int _hash(String key) throws Exception {
        int hash = 0;
        if(data.length==0)
        {
            throw new Exception("Cannot take 0 as the size");
        }
        for (int i = 0; i < key.length(); i++)
        {
            hash = (hash + key.codePointAt(i) * i) % data.length;
        }
        return hash;
    }
    /**
     * Adds a keyValue pair into the hash table
     * @param  key  a string key value
     * @param  value an integer value to store
     */
    public void set(String key, int value) throws Exception {
        int address=_hash(key);
        if(data[address]==null)
        {
            ArrayList<KeyValue> arrayAtAddress=new ArrayList<>();
            data[address]=arrayAtAddress;
            currentLength++;
        }
        KeyValue pair=new KeyValue(key,value);
        data[address].add(pair);
        totalSize++;
    }
    /**
     * Returns the value at the location of a key
     * @param  key  a string key value
     * @return      the value at the location of a key
     */
    public Integer get(String key) throws Exception {
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
    /**
     * Returns the set of keys present in the hash table
     * @return      the set of keys present in the hash table
     */
    public String[] keys()
    {
        ArrayList<KeyValue>[] holder=data;
        String[] keys=new String[totalSize];
        int count=0;
        int i=0;
        for (ArrayList<KeyValue> keyValues:holder)
        {
            i=0;
            if(keyValues!=null && keyValues.size()>1)
            {
                while (i<keyValues.size())
                {
                    keys[count]=keyValues.get(i).getKey();
                    count++;
                    i++;
                }
            }
           else if (keyValues!=null)
            {
               keys[count]=keyValues.get(0).getKey();
               count++;
            }
        }
        return keys;
    }

    /**
     * prints the create hash table
     */
    public void printTable()
    {
        ArrayList<KeyValue>[] holder=data;
        String[] keys=new String[currentLength];
        int count=0;
        int i=0;
        System.out.printf("%-20s %s\n", "Key", "Value");
        for (ArrayList<KeyValue> keyValues:holder) {
            i = 0;
            if (keyValues != null && keyValues.size() > 1) {
                while (i < keyValues.size()) {
                    System.out.printf("%-20s %s\n", keyValues.get(i).getKey(), keyValues.get(i).getValue());
                    i++;
                }
            }
            else if (keyValues != null) {
                System.out.printf("%-20s %s\n", keyValues.get(0).getKey(), keyValues.get(0).getValue());
                keys[count] = keyValues.get(0).getKey();
                count++;
            }
        }
    }
    /**
     *
     * @param args
     */
    public static void main(String[] args) throws Exception {
        HashTable hashTable = new HashTable(10);
        hashTable.set("grapes", 1200);
        hashTable.set("grapess", 120000);
        hashTable.set("apple", 1500);
        System.out.println("value for key grapes: " + hashTable.get("grapes"));
        System.out.println("value for key apple: " + hashTable.get("apple"));
        System.out.println("value for key grapess: " + hashTable.get("grapess"));
        System.out.println("list of keys: " + Arrays.toString(hashTable.keys()));
        hashTable.printTable();
    }
}
