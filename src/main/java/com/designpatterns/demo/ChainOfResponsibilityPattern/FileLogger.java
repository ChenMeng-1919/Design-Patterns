package com.designpatterns.demo.ChainOfResponsibilityPattern;

/*
 * @author: cm
 * @date: Created in 2021/6/1 9:56
 * @description:创建扩展了该记录器类的实体类。
 */
public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
