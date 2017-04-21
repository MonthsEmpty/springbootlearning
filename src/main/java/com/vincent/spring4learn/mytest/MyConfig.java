package com.vincent.spring4learn.mytest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dell on 2017/4/17.
 */
@Configuration
public class MyConfig {

    @Bean
    public PrintDemo printDemo(){
        PrintDemo printDemo1212 =new PrintDemo();
        printDemo1212.init();
        return printDemo1212 ;
    }
}
