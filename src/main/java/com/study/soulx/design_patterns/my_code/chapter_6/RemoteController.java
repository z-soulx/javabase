package com.study.soulx.design_patterns.my_code.chapter_6;

import java.util.stream.Stream;

/**
 * @program: java-base
 * @description: 远程控制台
 * eg:遥控器中有7个插槽，每个插槽一个命令
 * 如果想要撤销可以加个变量记录上个命令或加个栈，无限撤销
 * @author: soulx
 * @create: 2019-08-14 16:05
 **/
public class RemoteController {
    Command[] commands;

    RemoteController(){
        commands = new Command[7];
        Stream.iterate(0,n->n+1).limit(7).forEach(r->commands[r] = new NoCommand());
    }
/**
* @Description:  设置嵌入遥控器插槽对应的命令
 * * @Author: soulx
*/
    public void setCommands(int n,Command command){
       commands[n] = command;
    }

    /**
    * @Description: 按下某刻按钮对应插槽
    * @Author: soulx
    */
    public void takeOn(int n){
        commands[n].execute();
    }


    public static void main(String[] args) {
        Light light = new Light();
        LightCommand command = new LightCommand(light);

        RemoteController controller = new RemoteController();
        controller.setCommands(0,command);
        controller.takeOn(0);


    }
}
