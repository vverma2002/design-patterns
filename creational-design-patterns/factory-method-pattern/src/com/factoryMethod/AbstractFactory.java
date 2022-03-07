package com.factoryMethod;

public abstract class AbstractFactory {

	public AbstractObject getObject() {

		AbstractObject obj = createObject();

		obj.addDefaultFeature();

		return obj;

	}

	// Factory Method
	public abstract AbstractObject createObject();
}
