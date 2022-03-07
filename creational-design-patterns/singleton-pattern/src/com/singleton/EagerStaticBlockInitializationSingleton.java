package com.singleton;

public class EagerStaticBlockInitializationSingleton {

	private static EagerStaticBlockInitializationSingleton instance;

	private EagerStaticBlockInitializationSingleton() {
	}

	static {
		try {
			instance = new EagerStaticBlockInitializationSingleton(); // Instance creation
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static EagerStaticBlockInitializationSingleton getInstance() {
		return instance;
	}

	public void doSomething() {
		// do something
	}
}
