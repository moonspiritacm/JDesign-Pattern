package com.moonspirit.design.pattern.creational.builder.v1;

public class CourseActualBuilder extends CourseBuilder {
    private Course course = new Course();

    @Override
    public void buildName(String name) {
        course.setName(name);
    }

    @Override
    public void buildPpt(String ppt) {
        course.setPpt(ppt);
    }

    @Override
    public void buildVideo(String video) {
        course.setVideo(video);
    }

    @Override
    public void buildNote(String note) {
        course.setNote(note);
    }

    @Override
    public void buildQa(String qa) {
        course.setQa(qa);
    }

    @Override
    public Course makeCourse() {
        return course;
    }
}
