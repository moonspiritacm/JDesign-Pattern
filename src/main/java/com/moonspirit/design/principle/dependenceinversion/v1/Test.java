package com.moonspirit.design.principle.dependenceinversion.v1;

/**
 * 接口方法注入
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.studyCourse(new JavaCourse());
        student.studyCourse(new FrontCourse());

        /*
        Student student = new Student();
        student.studyJavaCourse();
        student.studyFECourse();
        */
    }
}
