package com.simpleFactory.examples.eg1;

public abstract class Fruit {

	protected String type;
	protected String color;

	protected String printFruitInfo() {
		return "Fruit Type:" + type + ", color:" + color;
	};

}
