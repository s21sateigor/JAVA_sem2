package service;

import model.*;
import model.Student;
import model.Faculty;
import model.Course;
import model.Professor;
import model.Grade;
import model.CourseGradeType;
import model.Degree;

import java.util.ArrayList;
import java.util.Arrays;

public class MainService
{
    private static ArrayList<Student> allStudentsList = new ArrayList<>();
    private static ArrayList<Professor> allProfessorList = new ArrayList<>();
    private static ArrayList<Course> allCoursesList = new ArrayList<>();
    private static ArrayList<Grade> allGradesList = new ArrayList<>();

    public static void main(String[] args) {


//        int[] mas = new int[5];
//        Student[] allStudents = new Student[6];
//        Professor[] allProfessors = new Professor[6];
//        Course[] allCourses = new Course[6];
//        Grade[] allGrades = new Grade[6];


        Student st1 = new Student();
        Student st2 = new Student("Jānis", "Bērziņš", Faculty.ITF, "010702-21555");
        Student st3 = new Student("Līga", "Bērzi2s", Faculty.TSF, "222222-44414");
//        Student[] allStudents = {st1, st2, st3};
//        for(Student student : allStudents){
//            System.out.println(student);
//        }
        //kad katru atseviski itereet


        allStudentsList.addAll(Arrays.asList(st1, st2, st3));

        for(Student student : allStudentsList) {
            System.out.println(student);
        }

        Professor pr1 = new Professor();
        Professor pr2 = new Professor("Karina", "Šķirmante", Degree.master);
        Professor pr3 = new Professor("Gaļina", "Hiļkēviča", Degree.phd);

//        Professor[] allProfessors = {pr1, pr2, pr3};
//        for(Professor professor : allProfessors){
//            System.out.println(professor);
//        }


        allProfessorList.addAll(Arrays.asList(pr1, pr2, pr3));

        for(Professor professor : allProfessorList){
            System.out.println(professor);
        }

        Course c1 = new Course();
        Course c2 = new Course("Programmēšana tīmeklī JAVA", 4, CourseGradeType.EXAM, pr2);
        Course c3 = new Course("Diferenciālvienādojumi", 2, CourseGradeType.EXAM, pr3);
        Course c4 = new Course("Datu Struktūras un pamatalgoritmi", 2, CourseGradeType.EXAM, pr2);
//        Course[] allCourses = {c1, c2, c3, c4};
//        for(Course course: allCourses){
//            System.out.println(course);
//        }


        allCoursesList.addAll(Arrays.asList(c1, c2, c3, c4));
        for(Course course: allCoursesList){
            System.out.println(course);
        }

        Grade gr1 = new Grade();
        Grade gr2 = new Grade(10, st2, c2);
        Grade gr3 = new Grade(6, st3, c2);
        Grade gr4 = new Grade(5, st2, c3);
        Grade gr5 = new Grade(7, st1, c4);

//        Grade[] allGrades = {gr1, gr2, gr3, gr4, gr5};
//        for(Grade grade : allGrades){
//            System.out.println(grade);
//        }

        allGradesList.addAll(Arrays.asList(gr1, gr2, gr3, gr4, gr5));
        for(Grade grade: allGradesList){
            System.out.println(grade);
        }


        System.out.println("-------------");
        for(Student temp: allStudentsList){
            System.out.println(temp.getName() + ": " + calculateAVGGrade(temp));
        }

        System.out.println("-----------");
        for(Course temp: allCoursesList){
            System.out.println(temp.getTitle() + ": " + calculateAVGCourseGrade(temp));
        }
    }

    private static float calculateAVGGrade(Student student){
        if( student != null){
            float gradesSum = 0;
            int gradesCounter = 0;
            for(Grade grade: allGradesList){
                if(grade.getStudent().equals(student)){
                    gradesSum += grade.getGrValue();
                    gradesCounter++;
                }
            }
            return gradesSum / gradesCounter;

        } else {
            return 0;
        }

    }

    private static float calculateAVGCourseGrade(Course course){
        if( course != null){
            float gradesSum = 0;
            int gradesCounter = 0;
            for(Grade grade: allGradesList){
                if(grade.getCourse().equals(course)){
                    gradesSum += grade.getGrValue();
                    gradesCounter++;
                }
            }
            return gradesSum / gradesCounter;

        } else {
            return 0;
        }

    }
}
