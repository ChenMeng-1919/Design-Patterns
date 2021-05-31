package com.designpatterns.demo.DecoratorPattern;

/*
 * @author: cm
 * @date: Created in 2021/5/30 17:58
 * @description:创建实现接口的实体类。
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
