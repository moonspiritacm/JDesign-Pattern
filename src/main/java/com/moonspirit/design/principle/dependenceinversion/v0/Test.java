package com.moonspirit.design.principle.dependenceinversion.v0;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.studyJavaCourse();
        student.studyFrontCourse();
    }
}
