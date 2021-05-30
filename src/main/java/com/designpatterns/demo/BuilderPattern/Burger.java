package com.designpatterns.demo.BuilderPattern;

/*
 * @author: cm
 * @date: Created in 2021/5/30 14:47
 * @description:
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
