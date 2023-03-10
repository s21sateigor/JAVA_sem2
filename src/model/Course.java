package model;

public class Course
{
    private long id;
    private String title; //only letters, digits and space
    private int creditPoints; // min = 1, max = 20
    private CourseGradeType type; // not null
    private Professor professor; // not null


    private static long courseCounter = 12000;
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = courseCounter;
        courseCounter++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String inputTitle) {
        if(inputTitle != null && inputTitle.matches("[a-z ,.'-]")){
            //[A-Z]{1}[a-zA-Z0-9s]
            title = inputTitle;
        } else {
            title = "Unknown";
        }
    }

    public int getCreditPoints() {
        return creditPoints;
    }

    public void setCreditPoints(int inputCreditPoints) {
        if(inputCreditPoints > 0 && inputCreditPoints < 21){
            creditPoints = inputCreditPoints;
        } else {
            creditPoints = 0;
        }

    }

    public CourseGradeType getType() {
        return type;
    }

    public void setType(CourseGradeType inputType) {
        if(inputType != null){
            type = inputType;
        } else {
            type = CourseGradeType.other;
        }
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor inputProfessor) {
        if(inputProfessor != null){
            professor = inputProfessor;
        } else {
            professor = new Professor();
        }

    }
}
