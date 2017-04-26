package com.vincent.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by renwu on 2017/4/26.
 */
public class Student {
    @JsonProperty(value = "real_name")
    private String realName;

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "realName='" + realName + '\'' +
                '}';
    }
}
