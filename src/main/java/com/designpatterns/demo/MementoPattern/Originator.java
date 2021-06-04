package com.designpatterns.demo.MementoPattern;

/*
 * @author: cm
 * @date: Created in 2021/6/4 14:49
 * @description:创建 Originator 类。
 */
public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento Memento) {
        state = Memento.getState();
    }
}
