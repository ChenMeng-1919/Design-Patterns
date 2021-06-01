package com.designpatterns.demo.SingletonPattern;

/*
 * @author: cm
 * @date: Created in 2021/6/1 11:18
 * @description:
 */
public class Singleton4 {
    private volatile static Singleton4 singleton;

    private Singleton4() {
    }

    public static Singleton4 getSingleton() {
        if (singleton == null) {
            synchronized (Singleton4.class) {
                if (singleton == null) {
                    singleton = new Singleton4();
                }
            }
        }
        return singleton;
    }
}
