package com.moonspirit.design.pattern.creational.singleton.lazy.lock;

/**
 * 懒汉式单例模式（线程安全）——同步锁
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton() {
    }

    /*
    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
    */

    public static LazySingleton getInstance() {
        synchronized (LazySingleton.class) {
            if (instance == null) {
                instance = new LazySingleton();
            }
        }
        return instance;
    }
}
