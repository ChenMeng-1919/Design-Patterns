package com.designpatterns.demo.AbstractFactoryPattern;

/*
 * @author: cm
 * @date: Created in 2021/5/30 18:12
 * @description:
 */
public class Green implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
