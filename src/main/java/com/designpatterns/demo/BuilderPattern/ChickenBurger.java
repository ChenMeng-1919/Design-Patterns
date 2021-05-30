package com.designpatterns.demo.BuilderPattern;

/*
 * @author: cm
 * @date: Created in 2021/5/30 14:51
 * @description:
 */
public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
