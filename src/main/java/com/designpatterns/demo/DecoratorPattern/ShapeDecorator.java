package com.designpatterns.demo.DecoratorPattern;

/*
 * @author: cm
 * @date: Created in 2021/5/31 16:36
 * @description:创建实现了 Shape 接口的抽象装饰类。
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
