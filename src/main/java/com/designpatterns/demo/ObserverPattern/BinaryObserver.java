package com.designpatterns.demo.ObserverPattern;

/*
 * @author: cm
 * @date: Created in 2021/6/4 11:34
 * @description:创建实体观察者类。
 */
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: "
                + Integer.toBinaryString(subject.getState()));
    }
}
