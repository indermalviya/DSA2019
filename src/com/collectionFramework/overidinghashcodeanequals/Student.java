package com.collectionFramework.overidinghashcodeanequals;

import java.util.Objects;

public class Student {

	/*
	 * it's always a good to override hashcode and the equals method.
	 * */
	Integer age;
	String classSequence;
	String name;

	public Student(String name, Integer age, String classSequence) {
		super();
		this.name = name;
		this.age = age;
		this.classSequence = classSequence;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}

		Student std = (Student) obj;

		return name == std.name && Objects.equals(age, std.age) && Objects.equals(classSequence, std.classSequence);

	}

	// java 7 way of overriding the hashcode
//	@Override
//	public int hashCode() {
//		return Objects.hash(name, age, classSequence);
//	}

	//classic old way of overriding the hascode
	@Override
	public int hashCode() {
		int result = 17;
		result = 31 * result + name.hashCode();
		result = 31 * result + age.hashCode();
		result = 31 * result + classSequence.hashCode();

		return result;
	}

	@Override
	public String toString() {
		return this.name + " " + this.age + " " + this.classSequence;
	}

}
