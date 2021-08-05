package com.moonspirit.design.principle.dependenceinversion.v1;

public class Student {
    public void studyCourse(ICourse iCourse) {
        iCourse.studyCourse();
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
