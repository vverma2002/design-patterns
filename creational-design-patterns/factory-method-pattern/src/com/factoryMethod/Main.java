package com.factoryMethod;

public class Main {

	public static void main(String[] args) {

		AbstractFactory fac = new ConcreateFactoryA();

		AbstractObject obj = fac.createObject();
		obj.doSomething();

	}
}
