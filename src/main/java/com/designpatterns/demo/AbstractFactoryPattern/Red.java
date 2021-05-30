package com.designpatterns.demo.AbstractFactoryPattern;

/*
 * @author: cm
 * @date: Created in 2021/5/30 18:12
 * @description:
 */
public class Red implements Color{
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
