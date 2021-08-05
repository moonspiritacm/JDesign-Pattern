package com.moonspirit.design.principle.dependenceinversion.v1;

public class FrontCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("XX is studying FrontEnd");
    }
}
