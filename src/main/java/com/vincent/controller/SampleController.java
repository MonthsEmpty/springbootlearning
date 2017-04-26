package com.vincent.controller;

import com.vincent.jackson.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by dell on 2017/4/10.
 */
@Controller
@RequestMapping("/test")
public class SampleController {

    @RequestMapping("/getStr")
    @ResponseBody
    String home(){
        System.out.println("123");
        return "Hello World";
    }

    @RequestMapping("/testResponseBody")
    @ResponseBody
    String testResponseBody(){
        return "/ss/aa";
    }

    @RequestMapping("/testSer")
    @ResponseBody
    public String testSer(@RequestBody Student student){
        System.out.println(student);
        return student == null ? "null" : student.getRealName();
    }
}

