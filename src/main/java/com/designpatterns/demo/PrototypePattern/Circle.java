package com.designpatterns.demo.PrototypePattern;

/*
 * @author: cm
 * @date: Created in 2021/6/1 11:30
 * @description:
 */
public class Circle extends Shape {
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
