package com.designpatterns.demo.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/*
 * @author: cm
 * @date: Created in 2021/6/4 11:33
 * @description:创建 Subject 类。
 */
public class Subject {

    private List<Observer> observers
            = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
