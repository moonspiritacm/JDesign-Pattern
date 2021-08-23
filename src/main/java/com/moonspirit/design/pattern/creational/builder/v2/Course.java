package com.moonspirit.design.pattern.creational.builder.v2;

public class Course {
    private String name;
    private String ppt;
    private String video;
    private String note;
    private String qa;

    public Course(CourseBuilder courseBuilder) {
        this.name = courseBuilder.name;
        this.ppt = courseBuilder.ppt;
        this.video = courseBuilder.video;
        this.note = courseBuilder.note;
        this.qa = courseBuilder.qa;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", ppt='" + ppt + '\'' +
                ", video='" + video + '\'' +
                ", note='" + note + '\'' +
                ", qa='" + qa + '\'' +
                '}';
    }

    public static class CourseBuilder {
        private String name;
        private String ppt;
        private String video;
        private String note;
        private String qa;

        public CourseBuilder buildName(String name) {
            this.name = name;
            return this;
        }

        public CourseBuilder buildPpt(String ppt) {
            this.ppt = ppt;
            return this;
        }

        public CourseBuilder buildVideo(String video) {
            this.video = video;
            return this;
        }

        public CourseBuilder buildNote(String note) {
            this.note = note;
            return this;
        }

        public CourseBuilder buildQa(String qa) {
            this.qa = qa;
            return this;
        }

        public Course build() {
            return new Course(this);
        }
    }
}
