package com.designpatterns.demo.ChainOfResponsibilityPattern;

/*
 * @author: cm
 * @date: Created in 2021/6/1 9:55
 * @description:创建扩展了该记录器类的实体类。
 */
public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
