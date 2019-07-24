package com.collectionFramework.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionFrameworkExcercise {

	public static void main(String[] args) {
		sortEmployeeByAge();
	}

	private static void sortEmployeeByAge() {

		List<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee("Atul", 7101, 28));
		emp.add(new Employee("john", 7001, 89));
		emp.add(new Employee("doe", 7801, 19));
		
		/*
		 * Used for the comparable scenario
		 * Collections.sort(emp);
		 * 
		 * for(Employee em:emp) { System.out.println(em); }
		 */
		
		Collections.sort(emp, new IDComparator());
		System.out.println("Sorting using the employeeID");
		for(Employee em: emp) {
			System.out.println("ID: " + em.getEmployeeID());
		}
		
		System.out.println("");
		
		Collections.sort(emp, new NameComparator());
		System.out.println("Sorting using the name");
		for(Employee em: emp) {
			System.out.println("name : " + em.getName() );
		}
	}

}
