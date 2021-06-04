package com.designpatterns.demo.PrototypePattern;

/*
 * @author: cm
 * @date: Created in 2021/6/1 11:29
 * @description:创建一个实现了 Cloneable 接口的抽象类
 */
public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    abstract void draw();

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
