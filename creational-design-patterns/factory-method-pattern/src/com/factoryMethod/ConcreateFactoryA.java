package com.factoryMethod;

public class ConcreateFactoryA extends AbstractFactory {
	@Override
	public AbstractObject createObject() {
		return new ConcreteObjectA();
	}
}
