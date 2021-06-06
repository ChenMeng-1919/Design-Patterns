package com.designpatterns.demo.AdapterPattern;

/*
 * @author: cm
 * @date: Created in 2021/6/6 14:47
 * @description:创建实现了 AdvancedMediaPlayer 接口的实体类。
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //什么也不做
    }
}
