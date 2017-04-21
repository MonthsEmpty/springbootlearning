package com.vincent.spring4learn.mytest;

import com.vincent.spring4learn.CDPlayer;
import com.vincent.spring4learn.CDPlayerConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by dell on 2017/4/13.
 */
public class AnnotationConfigApplicationContextTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyConfig.class);
        new ClassPathXmlApplicationContext();
        PrintDemo printDemo = (PrintDemo) ctx.getBean("printDemo");
        printDemo.print();
    }
}
