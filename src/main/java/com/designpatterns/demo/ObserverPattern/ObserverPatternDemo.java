package com.designpatterns.demo.ObserverPattern;

/*
 * @author: cm
 * @date: Created in 2021/6/4 11:36
 * @description:使用 Subject 和实体观察者对象。
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
