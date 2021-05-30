package com.designpatterns.demo.AbstractFactoryPattern;

/*
 * @author: cm
 * @date: Created in 2021/5/30 17:58
 * @description:
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
