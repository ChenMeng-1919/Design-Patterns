package com.designpatterns.demo.ServiceLocatorPattern;

/*
 * @author: cm
 * @date: Created in 2021/8/16 18:33
 * @description:创建实体服务。
 */
public class Service2 implements Service {
    public void execute() {
        System.out.println("Executing Service2");
    }

    @Override
    public String getName() {
        return "Service2";
    }
}
