package com.designpatterns.demo.SingletonPattern;

/*
 * @author: cm
 * @date: Created in 2021/6/1 11:17
 * @description:懒汉式，线程安全
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
