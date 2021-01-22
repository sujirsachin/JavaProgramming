package Cleo.School;

import java.util.ArrayList;

public class Teacher extends Person
{
    private ArrayList<Course> courses;

    public Teacher(String name) {
        super(name);
        courses=new ArrayList<>();
    }
    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }
}
