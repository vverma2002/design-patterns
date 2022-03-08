package com.factoryMethod;

public abstract class AbstractFactory {

	// Factory Method
	protected abstract AbstractObject createObject();

	// Common Logic shared by all
	public AbstractObject getObject() {
		AbstractObject obj = createObject();
		obj.addDefaultFeature();
		return obj;
	}
}
