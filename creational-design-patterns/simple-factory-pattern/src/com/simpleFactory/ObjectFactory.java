package com.simpleFactory;

public class ObjectFactory {

	public static AbstractObject getObject(String type) {
		if (type == null) {
			return null;
		} else if (type.equalsIgnoreCase("A")) {
			return new ConcreteObjectA();
		} else if (type.equalsIgnoreCase("B")) {
			return new ConcreteObjectB();
		}
		return null;
	}
}
