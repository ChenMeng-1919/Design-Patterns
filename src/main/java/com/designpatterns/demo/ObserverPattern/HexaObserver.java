package com.designpatterns.demo.ObserverPattern;

/*
 * @author: cm
 * @date: Created in 2021/6/4 11:35
 * @description:创建实体观察者类。
 */
public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: "
                + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
