package com.dp.singleton;

public class Singleton {

	private static Singleton instance = null;

	private Singleton() {
	}

	public static Singleton getInstance() {
		// double check for the safety from multiple threads with lazy loading.
		if (instance == null)
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		return instance;
	}

}
