package com.vincent.spring4learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by dell on 2017/4/13.
 */
public class AnnotationConfigApplicationContextTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
        CDPlayer cdPlayer = (CDPlayer) ctx.getBean("sgtPeppers");
        cdPlayer.play();
    }
}
