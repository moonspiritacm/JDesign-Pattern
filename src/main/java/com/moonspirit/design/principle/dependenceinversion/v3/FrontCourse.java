package com.moonspirit.design.principle.dependenceinversion.v3;

public class FrontCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("XX is studying FrontEnd");
    }
}
