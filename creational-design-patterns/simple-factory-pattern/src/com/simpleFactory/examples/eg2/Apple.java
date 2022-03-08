package com.simpleFactory.examples.eg2;

public class Apple extends Fruit {

	public Apple(String name) {
		this.name = name;
	}

	@Override
	protected String getColor() {
		return "red";
	}

	@Override
	public String toString() {
		return "Apple [name=" + name + ", getColor()=" + getColor() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
}
