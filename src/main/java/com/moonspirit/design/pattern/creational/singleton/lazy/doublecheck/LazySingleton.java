package com.moonspirit.design.pattern.creational.singleton.lazy.doublecheck;

/**
 * 懒汉式单例模式（线程安全）——双重检查&指令重排序
 * volatile保证内存可见性、禁止重排序
 */
public class LazySingleton {
    private volatile static LazySingleton instance = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
