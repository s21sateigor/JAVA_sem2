package model;

public class Student
{
    //1. variables
    private long st_ID;
    private String name;
    private String surname;
    private Faculty faculty;


    //constructors
    public Student(long st_ID, String name, String surname){
        this.st_ID = st_ID;
        this.name = name;
        this.surname = surname;
    }

    //getters and setters

    public long getSt_ID() {
        return st_ID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setSt_ID(long st_ID) {
        this.st_ID = st_ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }
}
