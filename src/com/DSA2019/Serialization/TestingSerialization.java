package com.DSA2019.Serialization;

import java.io.Serializable;

public class TestingSerialization implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int age;
	String designation;
	String name;
	//due to salary being transient it won't be serialiazed
	transient Integer salary;

	public TestingSerialization(String name, int age, String designation, Integer salary) {
		super();
		this.name = name;
		this.age = age;
		this.designation = designation;
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public String getDesignation() {
		return designation;
	}

	public String getName() {
		return name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

}
