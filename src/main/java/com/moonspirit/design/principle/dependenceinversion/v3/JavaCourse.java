package com.moonspirit.design.principle.dependenceinversion.v3;

public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("XX is studying Java");
    }
}
