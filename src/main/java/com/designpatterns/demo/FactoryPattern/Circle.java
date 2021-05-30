package com.designpatterns.demo.FactoryPattern;

/*
 * @author: cm
 * @date: Created in 2021/5/30 17:59
 * @description:
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
