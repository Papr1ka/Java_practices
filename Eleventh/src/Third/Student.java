package Third;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class Student {
    private String name;
    private String surname;
    private String speciality;
    private int course;
    private String group;
    private int[] grades;
    private Date born;

    private SimpleDateFormat fmt;

    public Student(String name, String surname, String speciality, int course, String group, int[] grades, Date born, SimpleDateFormat fmt) {
        this.name = name;
        this.surname = surname;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.grades = grades;
        this.born = born;
        this.fmt = fmt;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public SimpleDateFormat getFmt() {
        return fmt;
    }

    public void setFmt(SimpleDateFormat fmt) {
        this.fmt = fmt;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", speciality='" + speciality + '\'' +
                ", course=" + course +
                ", group='" + group + '\'' +
                ", grades=" + Arrays.toString(grades) +
                ", born=" + this.fmt.format(born) +
                '}';
    }

    public Date getBorn() {
        return born;
    }

    public void setBorn(Date born) {
        this.born = born;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }
}
