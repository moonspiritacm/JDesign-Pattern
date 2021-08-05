package com.moonspirit.design.pattern.creational.simplefactory.v1;

public class VideoFactory {
    public Video getVideo(String type) {
        if ("java".equalsIgnoreCase(type)) {
            return new JavaVideo();
        }
        if ("python".equalsIgnoreCase(type)) {
            return new PythonVideo();
        }
        return null;
    }
}
