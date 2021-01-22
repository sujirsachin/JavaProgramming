package Cleo.School;

public class Person {
    private String person_name;
    public Person(String name)
    {
        person_name = name;
    }
    public void setName(String name)
    {
        person_name = name;
    }

    public String getName()
    {
        return person_name;
    }
    // Define the setName() method
    public String toString()
    {
        return ("Name: " + person_name + "\n");
    }
}
