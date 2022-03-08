package com.simpleFactory.examples.eg2;

public class FruitFactory {

	public static Fruit getFruit(String fruitStr) {
		Fruit fruit = null;
		switch (fruitStr) {
		case "apple":
			fruit = new Apple("apple");
			break;
		case "orange":
			fruit = new Orange("orange");
			break;

		default:
			break;
		}
		return fruit;
	}

}
