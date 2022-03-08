package com.simpleFactory;

public class Main {

	public static void main(String[] args) {
		AbstractObject objA = ObjectFactory.getObjectA();
		AbstractObject objB = ObjectFactory.getObjectB();

		objA.doSomething();
		objB.doSomething();

		objA = SimpleObjectFactory.getObject("A");
		objB = SimpleObjectFactory.getObject("B");

		objA.doSomething();
		objB.doSomething();
	}
}
