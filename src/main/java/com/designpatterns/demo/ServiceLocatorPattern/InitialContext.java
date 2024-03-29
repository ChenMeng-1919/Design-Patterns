package com.designpatterns.demo.ServiceLocatorPattern;

/*
 * @author: cm
 * @date: Created in 2021/8/16 18:34
 * @description:为 JNDI 查询创建 InitialContext。
 */
public class InitialContext {
    public Object lookup(String jndiName) {
        if (jndiName.equalsIgnoreCase("SERVICE1")) {
            System.out.println("Looking up and creating a new Service1 object");
            return new Service1();
        } else if (jndiName.equalsIgnoreCase("SERVICE2")) {
            System.out.println("Looking up and creating a new Service2 object");
            return new Service2();
        }
        return null;
    }
}
