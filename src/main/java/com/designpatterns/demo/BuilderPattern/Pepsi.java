package com.designpatterns.demo.BuilderPattern;

/*
 * @author: cm
 * @date: Created in 2021/5/30 14:52
 * @description:
 */
public class Pepsi extends ColdDrink {
    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
