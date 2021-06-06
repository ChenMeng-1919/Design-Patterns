package com.designpatterns.demo.TemplatePattern;

/*
 * @author: cm
 * @date: Created in 2021/6/6 15:42
 * @description:创建扩展了上述类的实体类。
 */
public class Football extends Game {
    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
