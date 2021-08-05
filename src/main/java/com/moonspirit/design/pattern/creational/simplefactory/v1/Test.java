package com.moonspirit.design.pattern.creational.simplefactory.v1;

public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
        if(video != null) {
            video.produce();
        }
    }
}
