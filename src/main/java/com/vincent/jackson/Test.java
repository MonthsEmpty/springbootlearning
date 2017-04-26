package com.vincent.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by renwu on 2017/4/26.
 */
public class Test {
    public static void main(String[] args) throws JsonProcessingException {
        Student student = new Student();
        student.setRealName("zhangsan");
        System.out.println(new ObjectMapper().writeValueAsString(student));
    }
}
