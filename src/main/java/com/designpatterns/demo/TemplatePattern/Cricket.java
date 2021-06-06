package com.designpatterns.demo.TemplatePattern;

/*
 * @author: cm
 * @date: Created in 2021/6/6 15:41
 * @description:创建扩展了上述类的实体类。
 */
public class Cricket extends Game {

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}
