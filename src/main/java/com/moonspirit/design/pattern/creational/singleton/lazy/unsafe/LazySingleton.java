package com.moonspirit.design.pattern.creational.singleton.lazy.unsafe;

/**
 * 懒汉式单例模式（线程不安全）——延迟加载
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
