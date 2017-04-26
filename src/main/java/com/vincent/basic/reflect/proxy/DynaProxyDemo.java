package com.vincent.basic.reflect.proxy;

/**
 * Created by Administrator on 2017/4/26.
 */
public class DynaProxyDemo {

    public static void main(String[] args) {
        MyInvocationHandler handler = new MyInvocationHandler();
        Subject sub = (Subject) handler.bind(new RealSubject());
        Subject sub1 = new RealSubject();
        String info = sub.say("AAA",25);
        String info1 = sub1.say("AAA",25);
        System.out.println(info);
    }
}
