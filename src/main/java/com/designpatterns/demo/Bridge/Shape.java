package com.designpatterns.demo.Bridge;

/*
 * @author: cm
 * @date: Created in 2021/6/6 20:17
 * @description:使用 DrawAPI 接口创建抽象类 Shape。
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
