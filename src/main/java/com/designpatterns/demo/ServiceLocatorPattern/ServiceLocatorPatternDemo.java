package com.designpatterns.demo.ServiceLocatorPattern;

/*
 * @author: cm
 * @date: Created in 2021/8/16 18:35
 * @description:使用 ServiceLocator 来演示服务定位器设计模式。
 */
public class ServiceLocatorPatternDemo {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}
