/**
 * 
 */
package com.java8;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Atul Sharma
 *
 *         https://github.com/sourac
 */
public class StudentOperation {

	public static void main(String[] args) {

		HashSet<Student> hset = new HashSet<>();
		hset.add(new Student(1, "atul"));
		hset.add(new Student(2, "ciara"));
		System.out.println(hset.size());
//		System.out.println(hset.contains(new Student(1, "atul")));

		boolean val = findByID(1, hset);
		System.out.println(val );
	}

	/**
	 * @param i
	 * @param hset
	 * @return
	 */
	private static boolean findByID(int i, HashSet<Student> hset) {
		Iterator<Student> itr = hset.iterator();

		while (itr.hasNext()) {
			Student obj = itr.next();
			if (obj.getId() == i) {
				return true;
			}
		}
		return false;
	}

}
