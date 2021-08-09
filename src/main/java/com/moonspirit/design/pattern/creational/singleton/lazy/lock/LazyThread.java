package com.moonspirit.design.pattern.creational.singleton.lazy.lock;

public class LazyThread implements Runnable {
    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ": " + lazySingleton.toString());
    }
}
