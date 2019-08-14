package com.study.soulx.design_patterns.my_code.chapter_6;

/**
 * @program: java-base
 * @description: 灯泡命令把接受者灯泡也封装进去
 * @author: soulx
 * @create: 2019-08-14 15:52
 **/
public class LightCommand implements Command{
     Light light;

    LightCommand( Light light){
    this.light = light;
    }
    @Override
    public void execute() {
      light.lightOn();
    }
}
