package com.designpatterns.demo.PrototypePattern;

/*
 * @author: cm
 * @date: Created in 2021/6/1 11:29
 * @description:创建扩展了上面抽象类的实体类。
 */
public class Rectangle extends Shape {
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
