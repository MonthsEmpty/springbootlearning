package com.vincent.basic.reflect;

import com.vincent.aop.ReflectTest;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

/**
 * Created by Administrator on 2017/4/26.
 */
public class Test {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        /*Class clazz = Class.forName("com.vincent.annotation.MyAnnotation");
        Annotation[] annotations = clazz.getAnnotations();
        for(Annotation annotation : annotations){
            System.out.println(annotation.annotationType());
            System.out.println(annotation.annotationType().getName());
        }*/

        ReflectTest reflectTest = new ReflectTest();
        reflectTest.setSchool("nupt");
//        reflectTest.setName("vincent");
        System.out.println(reflectTest);

        Class c = ReflectTest.class;
        Field field = c.getDeclaredField("school");
        Field field1 = c.getDeclaredField("name");
        field.setAccessible(true);
        field1.setAccessible(true);
        System.out.println(field.get(reflectTest));
        System.out.println(field1.get(reflectTest));










    }

    public static void testFields() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class c = Class.forName("com.vincent.basic.SerializableTest.Child");
        Object o = c.newInstance();
//        Field[] fields = c.getFields();
        /*Field[] fields = c.getDeclaredFields();
        for(Field field : fields){
            System.out.println(field.getName());
        }*/
        Field field = c.getDeclaredField("school");
        Field field1 = c.getDeclaredField("grade");
//        field.setAccessible(true);
//        field1.setAccessible(true);
        field.set(o,"nupt");
        field1.set(o,"2");
        System.out.println(o);
    }

    public static void getSuperClassAndInterfaces() throws ClassNotFoundException {
        Class c = Class.forName("com.vincent.jackson.Student");
        System.out.println(c.getSuperclass().getName());
        Class[] cs = c.getInterfaces();
        for(Class clazz : cs){
            System.out.println(clazz.getName());
        }
    }

    public static void testMethod() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class c = Class.forName("com.vincent.jackson.Student");
        Method method = c.getMethod("print",String.class);
        method.invoke(c.newInstance(),"reflect");
    }

    public static void testConstructors() throws ClassNotFoundException {
        Class c = Class.forName("com.vincent.jackson.Student");
        Constructor[] cs = c.getConstructors();
        for(Constructor constructor : cs){
            int i = constructor.getModifiers();
            System.out.println(Modifier.toString(i));
            System.out.println(i);
            System.out.println(constructor.getName());
            Class[] params = constructor.getParameterTypes();
            for(Class clazz : params){
                System.out.println(clazz.getName());
            }
        }
    }
}
