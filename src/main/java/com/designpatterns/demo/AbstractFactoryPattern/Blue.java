package com.designpatterns.demo.AbstractFactoryPattern;

/*
 * @author: cm
 * @date: Created in 2021/5/30 18:13
 * @description:
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
