package com.designpatterns.demo.SingletonPattern;

/*
 * @author: cm
 * @date: Created in 2021/6/1 11:18
 * @description:饿汉式 线程安全
 */
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        return instance;
    }
}
