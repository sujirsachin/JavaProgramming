package Cleo.School;

import java.util.ArrayList;

public class Student extends Person{
    private ArrayList<Course> courses;
    public Student(String name) {
        super(name);
        courses=new ArrayList<>();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}
