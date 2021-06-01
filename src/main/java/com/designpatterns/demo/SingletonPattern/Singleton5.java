package com.designpatterns.demo.SingletonPattern;

/*
 * @author: cm
 * @date: Created in 2021/6/1 11:19
 * @description:登记式/静态内部类
 */
public class Singleton5 {
    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }

    private Singleton5() {
    }

    public static final Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
