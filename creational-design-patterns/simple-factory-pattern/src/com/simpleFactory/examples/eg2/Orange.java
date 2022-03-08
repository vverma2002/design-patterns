package com.simpleFactory.examples.eg2;

public class Orange extends Fruit {

	public Orange(String name) {
		this.name = name;
	}

	@Override
	protected String getColor() {
		return "Orange";
	}

	@Override
	public String toString() {
		return "Orange [name=" + name + ", getColor()=" + getColor() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
}
