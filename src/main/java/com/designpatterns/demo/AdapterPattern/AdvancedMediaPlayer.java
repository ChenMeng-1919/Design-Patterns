package com.designpatterns.demo.AdapterPattern;

/*
 * @author: cm
 * @date: Created in 2021/6/6 14:47
 * @description:为媒体播放器和更高级的媒体播放器创建接口。
 */
public interface AdvancedMediaPlayer {
    public void playVlc(String fileName);

    public void playMp4(String fileName);
}
