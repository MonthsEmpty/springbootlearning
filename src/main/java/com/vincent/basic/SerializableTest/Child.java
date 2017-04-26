package com.vincent.basic.SerializableTest;

import java.io.Serializable;

/**
 * Created by renwu on 2017/4/25.
 */
public class Child implements Serializable{

    private String school;

    private String grade;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Child{" +
                "school='" + school + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
