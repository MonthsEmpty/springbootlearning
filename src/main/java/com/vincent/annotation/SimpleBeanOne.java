package com.vincent.annotation;

/**
 * Created by Administrator on 2017/4/13.
 */
public class SimpleBeanOne {
    @SuppressWarnings("unchedked")
    @Deprecated
    @Override
    @MyAnnotation(key = "test")
    public String toString() {
        return "SimpleBeanOne{}";
    }
}
