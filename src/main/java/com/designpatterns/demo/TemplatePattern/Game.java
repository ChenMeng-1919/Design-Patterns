package com.designpatterns.demo.TemplatePattern;

/*
 * @author: cm
 * @date: Created in 2021/6/6 15:40
 * @description:创建一个抽象类，它的模板方法被设置为 final。
 */
public abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    //模板
    public final void play() {

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
