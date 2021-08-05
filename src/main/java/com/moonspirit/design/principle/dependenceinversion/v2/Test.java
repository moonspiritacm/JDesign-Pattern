package com.moonspirit.design.principle.dependenceinversion.v2;

/**
 * 构造器注入
 */
public class Test {
    public static void main(String[] args) {
        Student student = new Student(new JavaCourse());
        student.studyCourse();
    }
}
