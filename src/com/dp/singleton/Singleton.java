package com.dp.singleton;

import java.io.Serializable;

public class Singleton implements Serializable {

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

	// to resolve the issue arises due to serialization.
	protected Object readResolve() {
		return instance;
	}

}
