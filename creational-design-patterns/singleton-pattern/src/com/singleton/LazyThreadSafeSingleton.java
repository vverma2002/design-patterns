package com.singleton;

public class LazyThreadSafeSingleton {

	private static final Object lock = new Object();

	private static LazyThreadSafeSingleton instance;

	private LazyThreadSafeSingleton() {
	}

	public static LazyThreadSafeSingleton getInstance() {
		if (instance == null) {
			synchronized (lock) {
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
