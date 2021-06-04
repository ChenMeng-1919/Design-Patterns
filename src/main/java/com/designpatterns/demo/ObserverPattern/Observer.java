package com.designpatterns.demo.ObserverPattern;

/*
 * @author: cm
 * @date: Created in 2021/6/4 11:33
 * @description:创建 Observer 类。
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
