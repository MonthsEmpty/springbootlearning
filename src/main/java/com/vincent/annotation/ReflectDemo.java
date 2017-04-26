package com.vincent.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/4/13.
 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class<?> c = null;
        c= Class.forName("com.vincent.annotation.SimpleBeanOne");
        Method toM = c.getMethod("toString");
        Annotation an[] = toM.getAnnotations();
        for(Annotation a : an){
            System.out.println(a);
        }
        if(toM.isAnnotationPresent(MyAnnotation.class)){
            MyAnnotation ma = null;
            ma = toM.getAnnotation(MyAnnotation.class);
            String key = ma.key();
            String value = ma.value();
            System.out.println("key : " + key + ",value : " + value);
        }
    }
}
