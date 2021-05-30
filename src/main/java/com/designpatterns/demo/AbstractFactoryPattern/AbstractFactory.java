package com.designpatterns.demo.AbstractFactoryPattern;

/*
 * @author: cm
 * @date: Created in 2021/5/30 18:13
 * @description:
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
