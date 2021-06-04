package com.designpatterns.demo.MementoPattern;

/*
 * @author: cm
 * @date: Created in 2021/6/4 14:49
 * @description:创建 Memento 类。
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
