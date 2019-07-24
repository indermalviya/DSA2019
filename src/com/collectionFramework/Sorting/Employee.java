package com.collectionFramework.Sorting;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Employee implements Comparable<Employee> {

	Integer age;
	Integer employeeID;
	String name;

	public Employee(String name, Integer employeeID, Integer age) {
		super();
		this.name = name;
		this.employeeID = employeeID;
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}

	public Integer getEmployeeID() {
		return employeeID;
	}

	public String getName() {
		return name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeID=" + employeeID + ", age=" + age + "]";
	}

	
	//comparable interface only allows single sorting sequence.
	//for multiple sorting sequence,we can use the comparator interface.
	@Override
	public int compareTo(Employee o) {

		//to sort using the age
		if (this.age == o.age) {
			return 0;
		} else if (this.age > o.age) {
			return 1;
		}

		return -1;
		//to sort using the name
//		return this.name.compareTo(o.name);
	}

}
