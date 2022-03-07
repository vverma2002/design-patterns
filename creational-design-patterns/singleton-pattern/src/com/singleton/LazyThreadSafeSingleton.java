package com.singleton;

public class LazyThreadSafeSingleton {

	private static LazyThreadSafeSingleton instance;

	private LazyThreadSafeSingleton() {
	}

	public static LazyThreadSafeSingleton getInstance() {
		if (instance == null) {
			synchronized (LazyThreadSafeSingleton.class) {
				if (instance == null) {
					instance = new LazyThreadSafeSingleton();
				}
			}
		}
		return instance;
	}

	public void doSomething() {
		// do something
	}
}
