package com.designpatterns.demo.PrototypePattern;

/*
 * @author: cm
 * @date: Created in 2021/6/1 11:30
 * @description:创建扩展了上面抽象类的实体类。
 */
public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
