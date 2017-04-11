package com.vincent.aop;

import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by dell on 2017/4/11.
 */
public class LogRecordAspect {

    // 定义切点Pointcut
    @Pointcut("execution(* com.jiaobuchong.web.*Controller.*(..))")
    public void excudeService() {
    }

}
