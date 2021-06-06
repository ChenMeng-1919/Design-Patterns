package com.designpatterns.demo.TemplatePattern;

/*
 * @author: cm
 * @date: Created in 2021/6/6 15:42
 * @description:使用 Game 的模板方法 play() 来演示游戏的定义方式。
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
