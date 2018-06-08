package com.lizp.springmvc.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

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
}
