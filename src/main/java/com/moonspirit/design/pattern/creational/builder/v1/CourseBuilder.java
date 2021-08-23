package com.moonspirit.design.pattern.creational.builder.v1;

public abstract class CourseBuilder {
    public abstract void buildName(String name);

    public abstract void buildPpt(String ppt);

    public abstract void buildVideo(String video);

    public abstract void buildNote(String note);

    public abstract void buildQa(String qa);

    public abstract Course makeCourse();
}
