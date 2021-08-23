package com.moonspirit.design.pattern.creational.builder.v1;

public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("名称", "讲义", "视频", "笔记", "问答");
        System.out.println(course);
    }
}
