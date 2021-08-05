package com.moonspirit.design.principle.dependenceinversion.v2;

public class Student {
    private ICourse iCourse;

    public Student(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyCourse() {
        this.iCourse.studyCourse();
    }

    /*
    public void studyJavaCourse() {
        System.out.println("XX is studying Java");
    }

    public void studyFrontCourse() {
        System.out.println("XX is studying FrontEnd");
    }
    */
}
