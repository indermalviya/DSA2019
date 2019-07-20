package com.dp.singleton;

public class SingletonDriver {

	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		System.out.println(instance);
		Singleton instance1 = Singleton.getInstance();
		System.out.println(instance1);

		if (instance == instance1) {
			System.out.println("Singleton, only one instance");
		}
		else {
			System.out.println("not singleton");
		}
	}

}
