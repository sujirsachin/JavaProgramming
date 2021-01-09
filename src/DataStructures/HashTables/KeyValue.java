package DataStructures.HashTables;

public class KeyValue {
    private String key;
    private int value;
    /**
     *
     * @param key
     * @param value
     */
    public KeyValue(String key, int value)
    {
        this.key=key;
        this.value=value;
    }

    /**
     *
     * @param key
     */
    public void setKey(String key)
    {
        this.key=key;
    }

    /**
     *
     * @return key
     */
    public String getKey()
    {
        return this.key;
    }

    /**
     *
     * @param value
     */
    public void setValue(int value)
    {
        this.value=value;
    }

    /**
     *
     * @return value
     */
    public int getValue()
    {
        return this.value;
    }
}
