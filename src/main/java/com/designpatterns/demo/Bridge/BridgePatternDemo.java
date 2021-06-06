package com.designpatterns.demo.Bridge;

/*
 * @author: cm
 * @date: Created in 2021/6/6 20:18
 * @description:使用 Shape 和 DrawAPI 类画出不同颜色的圆。
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
