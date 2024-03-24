package org.example.streams;

public class StudentGrade {
    private String name;
    private double grade;

    public StudentGrade(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }
}
