package com.moonspirit.design.principle.dependenceinversion.v3;

/**
 * setter注入
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setiCourse(new JavaCourse());
        student.studyCourse();
        student.setiCourse(new FrontCourse());
        student.studyCourse();
    }
}
