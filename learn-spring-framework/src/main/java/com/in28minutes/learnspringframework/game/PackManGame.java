package com.in28minutes.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
//When you declare Component annotation ,spring will create instance of this class and
// this component becomes a candidate as a spring bean while spring scanner scans the classpath
public class PackManGame implements GamingConsole{
    public void up(){
        System.out.println("fly up");
    }
    public void down(){
        System.out.println("come down");
    }
    public void left(){
        System.out.println("Go back");
    }
    public void right(){
        System.out.println("fly faster");
    }
}
