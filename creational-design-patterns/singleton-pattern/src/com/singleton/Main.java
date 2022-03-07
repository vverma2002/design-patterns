package com.singleton;

public class Main {

	public static void main(String[] args) {
		BillPughSingleton.getInstance().doSomething(); // Best
		EagerEnumSingleton.INSTANCE.doSomething();
		EagerInitializationSingleton.getInstance().doSomething();
		EagerStaticBlockInitializationSingleton.getInstance().doSomething();
		LazyInitializationSingleton.getInstance().doSomething();
		LazyThreadSafeSingleton.getInstance().doSomething();
	}
}
