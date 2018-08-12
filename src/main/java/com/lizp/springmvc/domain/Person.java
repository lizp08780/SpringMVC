﻿package com.lizp.springmvc.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.google.common.base.Objects;

import java.util.Date;


public class Person {
    private int age;
    private String name;

    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
    private Date create;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreate() {
        return create;
    }

    public void setCreate(Date create) {
        this.create = create;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", create=" + create +
                '}';
    }
}
