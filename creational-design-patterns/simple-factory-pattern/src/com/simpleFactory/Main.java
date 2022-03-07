package com.simpleFactory;

public class Main {

	public static void main(String[] args) {
		AbstractObject objA = ObjectFactory.getObject("A");
		AbstractObject objB = ObjectFactory.getObject("B");

		objA.doSomething();
		objB.doSomething();
	}
}
