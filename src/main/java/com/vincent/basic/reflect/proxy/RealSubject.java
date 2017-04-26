package com.vincent.basic.reflect.proxy;

/**
 * Created by Administrator on 2017/4/26.
 */
public class RealSubject implements Subject{
    @Override
    public String say(String name, int age) {
        return "姓名：" + name + "，年龄：" + age;
    }
}
