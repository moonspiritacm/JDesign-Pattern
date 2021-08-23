package com.moonspirit.design.pattern.creational.builder.v1;

public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String name, String ppt, String video, String note, String qa) {
        this.courseBuilder.buildName(name);
        this.courseBuilder.buildPpt(ppt);
        this.courseBuilder.buildVideo(video);
        this.courseBuilder.buildNote(note);
        this.courseBuilder.buildQa(qa);
        return this.courseBuilder.makeCourse();
    }
}
