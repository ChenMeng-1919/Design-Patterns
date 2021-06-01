package com.designpatterns.demo.SingletonPattern;

/*
 * @author: cm
 * @date: Created in 2021/6/1 11:16
 * @description:懒汉式，线程不安全
 */
public class Singleton1 {
    private static Singleton1 instance;

    private Singleton1() {
    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            instance = new Singleton1();
        }
        return instance;
    }
}
