package com.moonspirit.design.pattern.creational.simplefactory.v2;

public class Test {
    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo(JavaVideo.class);
        if(video != null) {
            video.produce();
        }
    }
}
