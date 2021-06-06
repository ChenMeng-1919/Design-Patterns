package com.designpatterns.demo.ProxyPattern;

/*
 * @author: cm
 * @date: Created in 2021/6/6 15:07
 * @description:创建实现接口的实体类。
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
