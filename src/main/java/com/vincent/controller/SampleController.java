package com.vincent.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by dell on 2017/4/10.
 */
@Controller
@EnableAutoConfiguration
@RequestMapping("/test")
public class SampleController {

    @RequestMapping("/getStr")
    @ResponseBody
    String home(){
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleController.class,args);
    }
}
