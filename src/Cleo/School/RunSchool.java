package Cleo.School;

import java.util.ArrayList;

public class RunSchool {

    public static void main(String args[])
    {
        //Testing Student
        Student student1=new Student("Sachin");
        Course courses=new Course("MATH101","B","2016","Fall");
        ArrayList<Course> newCourse=new ArrayList<>();
        newCourse.add(courses);
        courses=new Course("MATH106","A","2017","Spring");
        student1.setCourses(newCourse);
        newCourse.add(courses);
        student1.setCourses(newCourse);
        courses=new Course("MATH107","B","2017","Spring");
        newCourse.add(courses);
        student1.setCourses(newCourse);
        courses=new Course("MATH108","A","2017","Spring");
        newCourse.add(courses);
        student1.setCourses(newCourse);
        School newSchool=new School();
        newSchool.addStudents(student1);
        //For a given student and course offering, return the grade
        System.out.println("For a given student and course offering, return the grade");
        newSchool.getGrade("Sachin","MATH108");
        System.out.println("For a given student, year, and semester, return a grade point average");
        //For a given student, year, and semester, return a grade point average
        newSchool.getGrade("Sachin", "2017","Spring");
        System.out.println("For a given student, year, and semester, return a list of courses and the grades that the given student received in those courses");
        //For a given student, year, and semester, return a list of courses and the grades that the given student received in those courses
        newSchool.getInfo("Sachin", "2017","Spring");
        System.out.println("");
        System.out.println("For a given student, year, and semester, return a list of courses and the grades that the given student received in those courses");
        //For a given student, year, and semester, return a list of courses and the grades that the given student received in those courses
        newSchool.getInfo("Sachin", "2016","Fall");

        //Testing Teacher
        Teacher teacher=new Teacher("Jill Carey");
        Course courseTeacher=new Course("MATH107","2017","Spring");
        ArrayList<Course> newCourseTeacher=new ArrayList<>();
        newCourseTeacher.add(courseTeacher);
        teacher.setCourses(newCourseTeacher);
        courseTeacher=new Course("MATH108","2017","Spring");
        newCourseTeacher.add(courseTeacher);
        teacher.setCourses(newCourseTeacher);
        newSchool.addTeachers(teacher);
        System.out.println("For a given course offering, return the teacher");
        //For a given course offering, return the teacher
        newSchool.getTeacher("MATH108");

        Teacher teacher2=new Teacher("Sachin Sujir");
        courseTeacher=new Course("MATH115","2017","Spring");
        ArrayList<Course> newCourseTeacher2=new ArrayList<>();
        newCourseTeacher2.add(courseTeacher);
        teacher2.setCourses(newCourseTeacher2);
        courseTeacher=new Course("MATH116","2017","Spring");
        newCourseTeacher2.add(courseTeacher);
        teacher2.setCourses(newCourseTeacher2);
        newSchool.addTeachers(teacher2);
        System.out.println("For a given course offering, return the teacher");
        //For a given course offering, return the teacher
        newSchool.getTeacher("MATH116");
    }
}
