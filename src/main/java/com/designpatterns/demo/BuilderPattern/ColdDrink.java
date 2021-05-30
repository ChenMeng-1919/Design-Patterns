package com.designpatterns.demo.BuilderPattern;

/*
 * @author: cm
 * @date: Created in 2021/5/30 14:50
 * @description:
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
