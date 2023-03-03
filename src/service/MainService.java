package service;

import model.Faculty;
import model.Student;

public class MainService
{
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student("Jānis", "Bērziņš", Faculty.ITF, "010702-21555");
        Student st3 = new Student();
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
    }
}
