package com.designpatterns.demo.StrategyPattern;

/*
 * @author: cm
 * @date: Created in 2021/6/6 15:30
 * @description:使用 Context 来查看当它改变策略 Strategy 时的行为变化。
 */
public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
