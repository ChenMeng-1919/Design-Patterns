package com.designpatterns.demo.ServiceLocatorPattern;

/*
 * @author: cm
 * @date: Created in 2021/8/16 18:35
 * @description:创建服务定位器。
 */
public class ServiceLocator {
    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static Service getService(String jndiName) {

        Service service = cache.getService(jndiName);

        if (service != null) {
            return service;
        }

        InitialContext context = new InitialContext();
        Service service1 = (Service) context.lookup(jndiName);
        cache.addService(service1);
        return service1;
    }
}
