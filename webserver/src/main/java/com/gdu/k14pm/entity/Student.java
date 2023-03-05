package com.gdu.k14pm.entity;

public class Student {
    private String name;
    private double mark;
    private String major;
    public Student(String name, double mark, String major) {
        this.name = name;
        this.mark = mark;
        this.major = major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public String getMajor() {
        return major;
    }
    public void setMark(double mark) {
        this.mark = mark;
    }
    public double getMark() {
        return mark;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
