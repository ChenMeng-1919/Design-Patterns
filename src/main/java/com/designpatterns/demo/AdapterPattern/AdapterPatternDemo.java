package com.designpatterns.demo.AdapterPattern;

/*
 * @author: cm
 * @date: Created in 2021/6/6 14:50
 * @description:使用 AudioPlayer 来播放不同类型的音频格式。
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
