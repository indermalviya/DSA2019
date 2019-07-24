package com.collectionFramework.Sorting;

import java.util.Comparator;

public class IDComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.employeeID == o2.employeeID) {
			return 0;
		} else if (o1.employeeID > o2.employeeID) {
			return 1;
		}
		return -1;
	}

}
