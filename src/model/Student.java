package model;

import javax.naming.NamingEnumeration;

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

    public void setName(String inputName) {
        if(inputName.matches("[A-ŽĪĶĻŠČ]")){
            name = inputName;
        } else {
            name = "Unknown";
        }

    }

}
