package Cleo.School;

public class Course
{
    private String courseID;
    private int numPerson;
    private String year;
    private String semester;
    private String grade;

    public Course(String id, String grade, String year, String semester)
    {
        this.courseID=id;
        this.year=year;
        this.semester=semester;
        this.grade=grade;
    }

    public Course(String id, String year, String semester)
    {
        this.courseID=id;
        this.year=year;
        this.semester=semester;
    }
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSemester() {
        return semester;
    }

    public int getNumPerson() {
        return numPerson;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setNumPerson(int numPerson) {
        this.numPerson = numPerson;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseID() {
        return courseID;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    public String toString()
    {
        return ("Course ID: " + courseID + "\nGrade: " + grade);
    }
}
