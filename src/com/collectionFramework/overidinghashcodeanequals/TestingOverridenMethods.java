package com.collectionFramework.overidinghashcodeanequals;

public class TestingOverridenMethods {

	public static void main(String[] args) {

		Student st = new Student("Atul", 27, "X");
		Student st1 = new Student("Atul", 27, "X");

		// this will return true after overriding the equals

		System.out.println(st.equals(st1));
		System.out.println(st.hashCode());
	}

}
