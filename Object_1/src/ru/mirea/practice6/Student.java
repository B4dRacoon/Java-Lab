package ru.mirea.practice6;

public class Student implements Comparable {

    private int idNum;
    private int GPA;

    public Student(int idNum, int GPA) {
        this.idNum = idNum;
        this.GPA = GPA;
    }

    public String toString() {
        return "Student{" +
                "idNum=" + idNum +
                ", GPA=" + GPA +
                '}';
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public int compareTo(Object o) {
        return this.idNum - ((Student) o).idNum;
    }
}