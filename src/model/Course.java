package model;

public class Course
{
    private long id;
    private String title; //only letters, digits and space
    private int creditPoints; // min = 1, max = 20
    private CourseGradeType type; // not null
    private Professor professor; // not null

    public long getId() {
        return id;
    }

    public void setC_ID(long c_ID) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCreditPoints() {
        return creditPoints;
    }

    public void setCreditPoints(int creditPoints) {
        this.creditPoints = creditPoints;
    }
}
