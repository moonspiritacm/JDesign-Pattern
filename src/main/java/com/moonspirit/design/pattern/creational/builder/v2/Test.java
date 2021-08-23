package com.moonspirit.design.pattern.creational.builder.v2;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildName("名称").buildPpt("讲义").buildVideo("视频").buildQa("问答").build();
        System.out.println(course);
    }
}
