package com.vincent.basic.SerializableTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by renwu on 2017/4/25.
 */
public class SimpleSerial {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file = new File("person.out");
        List<Child> list = new ArrayList<>();
        Child child = new Child();
        child.setGrade("5");
        child.setSchool("aaa");
        list.add(child);
        Child child1 = new Child();
        child1.setGrade("4");
        child1.setSchool("bbb");
        ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(file));
        Person person = new Person("John", 101, Gender.MALE,list);
        oout.writeObject(person);
        oout.close();

        ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file));
        Object newPerson = oin.readObject(); // 没有强制转换到Person类型
        oin.close();
        System.out.println(newPerson);
    }
}
