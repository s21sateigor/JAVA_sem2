package service;

import model.*;

public class MainService
{
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student("Jānis", "Bērziņš", Faculty.ITF, "010702-21555");
        Student st3 = new Student("Jā251nis", "Bērzi2s", Faculty.TSF, "222222-44414");
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);

        Professor pr1 = new Professor();
        System.out.println(pr1);
        Professor pr2 = new Professor("Karina", "Šķirmante", Degree.master);
        System.out.println(pr2);
        Professor pr3 = new Professor("Gaļina", "Hiļkēviča", Degree.phd);
        System.out.println(pr3);

        Course c1 = new Course();
        System.out.println(c1);
        Course c2 = new Course("Programmēšana tīmeklī JAVA", 4, CourseGradeType.EXAM, pr2);
        System.out.println(c2);
        Course c3 = new Course("Diferenciālvienādojumi", 2, CourseGradeType.EXAM, pr3);
        System.out.println(c3);
        Course c4 = new Course("Datu Struktūras un pamatalgoritmi", 2, CourseGradeType.EXAM, pr2);
        System.out.println(c4);

    }
}
