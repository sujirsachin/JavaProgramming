package Cleo.School;

import java.util.ArrayList;

public class School {
    private ArrayList<Student> students;
    private ArrayList<Course> courses;
    private ArrayList<Teacher> teachers;
    public School()
    {
        this.students=new ArrayList<>();
        this.courses=new ArrayList<>();
        this.teachers=new ArrayList<>();
    }

    /**
     * Adding a student to the school
     * @param student
     */
    public void addStudents(Student student)
    {
       this.students.add(student);
    }

    /**
     * Adding a teacher t the school
     * @param teacher
     */
    public void addTeachers(Teacher teacher)
    {
        this.teachers.add(teacher);
    }

    /**
     * Given the name and the course, gets the grade of the student
     * @param name
     * @param course
     */
    public void getGrade(String name, String course)
    {
        //iterating through students
        for(int i=0;i<students.size();i++)
        {
            //iterating through individual students to get courses
            for(int j=0;j<students.get(i).getCourses().size();j++)
            {
                //checking if the student's name and course match
                if(students.get(i).getName().equals(name) && students.get(i).getCourses().get(j).getCourseID().equals(course) )
                {
                    System.out.println(students.get(i).getCourses().get(j).getGrade());
                }
            }
        }
    }

    /**
     * given a student's name, year and semester, gets the grade point average for that year and semester
     * @param name
     * @param year
     * @param semester
     */
    public void getGrade(String name, String year, String semester)
    {
        int gradePoint=0;
        int credit=0;
        //iterating through students
        for(int i=0;i<students.size();i++)
        {
            for(int j=0;j<students.get(i).getCourses().size();j++)
            {
                //iterating through individual students to get courses
                if(students.get(i).getName().equals(name) && students.get(i).getCourses().get(j).getSemester().equals(semester) && students.get(i).getCourses().get(j).getYear().equals(year))
                {
                    //checking if the student's name and course match
                    //for simplicity the number of credits is assumed to be 3 for all the courses.
                    if(students.get(i).getCourses().get(j).getGrade().equals("A"))
                    {
                        //'A' grade gives 4 points and it is multiplied with the number of credits
                        gradePoint+=4*3;
                        credit+=3;
                    }
                    else if(students.get(i).getCourses().get(j).getGrade().equals("B"))
                    {
                        //'B' grade gives 3 points and it is multiplied with the number of credits
                        gradePoint+=3*3;
                        credit+=3;
                    }
                    else if(students.get(i).getCourses().get(j).getGrade().equals("C"))
                    {
                        //'C' grade gives 2 points and it is multiplied with the number of credits
                        gradePoint+=2*3;
                        credit+=3;
                    }
                    else if(students.get(i).getCourses().get(j).getGrade().equals("D"))
                    {
                        //'D' grade gives 1 points and it is multiplied with the number of credits
                        gradePoint+=1*3;
                        credit+=3;
                    }
                    else
                    {
                        //Any other grade results in a failure.
                        gradePoint+=0;
                        credit+=3;
                    }
                }
            }
        }
        //calculating the average grade point which is the total grade point divided by the number of credits taken in a semester
        float avgGradePoint=(float)gradePoint/credit;
        System.out.println(avgGradePoint);
    }

    /**
     * given a student's name, year and the semester, gets the course Id and the grade of the student.
     * @param name
     * @param year
     * @param semester
     */
    public void getInfo(String name, String year, String semester)
    {
        for(int i=0;i<students.size();i++) {
            for (int j = 0; j < students.get(i).getCourses().size(); j++) {
                if (students.get(i).getName().equals(name) && students.get(i).getCourses().get(j).getSemester().equals(semester) && students.get(i).getCourses().get(j).getYear().equals(year)) {
                    System.out.println("Course ID:"+students.get(i).getCourses().get(j).getCourseID()+", Grade:"+students.get(i).getCourses().get(j).getGrade());
                }
            }
        }
    }

    /**
     * given the course, gets the teacher's name who is instructing the course.
     * @param course
     */
    public void getTeacher(String course)
    {
        //iterating through all the teachers
        for(int i=0;i<teachers.size();i++)
        {
            //iterating through individual teacher's courses
            for (int j = 0; j < teachers.get(i).getCourses().size(); j++)
            {
                if(teachers.get(i).getCourses().get(j).getCourseID().equals(course)) {
                    System.out.println(teachers.get(i).getName());
                }
            }
        }
    }
}
