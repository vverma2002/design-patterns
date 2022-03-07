package com.factoryMethod;

public class ConcreateFactoryB extends AbstractFactory {
	@Override
	public AbstractObject createObject() {
		return new ConcreteObjectB();
	}
}
