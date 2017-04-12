package com.vincent.spring4learn;

import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/4/12.
 */
@Component //这个简单的注解表明该类会作为组件类，并告知Spring要为这个类创建bean。
public class SgtPeppers implements CompactDisc{
    private String title = "Sgt. pepper's Lonely Hearts Club Band";

    private String artist = "The Beatles";
    @Override
    public void play() {
        System.out.println("Playing " + title + "by" + artist);
    }
}
