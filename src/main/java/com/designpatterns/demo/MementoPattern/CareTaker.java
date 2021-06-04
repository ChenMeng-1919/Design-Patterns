package com.designpatterns.demo.MementoPattern;

import java.util.ArrayList;
import java.util.List;

/*
 * @author: cm
 * @date: Created in 2021/6/4 14:50
 * @description:创建 CareTaker 类。
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
