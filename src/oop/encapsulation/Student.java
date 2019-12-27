package oop.encapsulation;

public class Student {
    // create and Declare only some private Variables

    private String stName;
    private String stDOB;
    private int stTution;

    public Student(String stName, String stDOB) {
        this.stName = stName;
        this.stDOB = stDOB;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
    }

    public String getStDOB() {
        return stDOB;
    }

    public void setStDOB(String stDOB) {
        this.stDOB = stDOB;
    }

    public int getStTution() {
        return stTution;
    }
    public Student(){}

    public Student(String stName, String stDOB, int stTution, String stGrade) {
        this.stName = stName;
        this.stDOB = stDOB;
        this.stTution = stTution;
        this.stGrade = stGrade;
    }

    public void setStTution(int stTution) {
        this.stTution = stTution;
    }

    public String getStGrade() {
        return stGrade;
    }

    public void setStGrade(String stGrade) {
        this.stGrade = stGrade;
    }

    private String stGrade;

    // We go to create a new class and there we can go to the main/ driver/ Test
}
