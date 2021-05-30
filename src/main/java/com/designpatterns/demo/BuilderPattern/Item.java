package com.designpatterns.demo.BuilderPattern;

/*
 * @author: cm
 * @date: Created in 2021/5/30 14:44
 * @description:
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
