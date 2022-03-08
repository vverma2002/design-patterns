package com.simpleFactory;

public class ObjectFactory {

	public static AbstractObject getObjectA() {
		return new ConcreteObjectA();
	}

	public static AbstractObject getObjectB() {
		return new ConcreteObjectB();
	}
}
