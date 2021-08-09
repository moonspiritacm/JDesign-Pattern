package com.moonspirit.design.pattern.creational.singleton.lazy.unsafe;

public class LazyThread implements Runnable {
    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ": " + lazySingleton.toString());
    }
}
