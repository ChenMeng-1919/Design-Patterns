package com.designpatterns.demo.StrategyPattern;

/*
 * @author: cm
 * @date: Created in 2021/6/6 15:29
 * @description:创建实现接口的实体类。
 */
public class OperationSubtract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
