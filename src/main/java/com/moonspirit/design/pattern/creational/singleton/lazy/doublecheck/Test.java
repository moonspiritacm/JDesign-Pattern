package com.moonspirit.design.pattern.creational.singleton.lazy.doublecheck;

public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(new LazyThread());
        Thread t2 = new Thread(new LazyThread());
        t1.start();
        t2.start();
    }
}
