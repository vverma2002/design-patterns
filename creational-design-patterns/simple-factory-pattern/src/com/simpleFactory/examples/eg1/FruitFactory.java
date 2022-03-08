package com.simpleFactory.examples.eg1;

public class FruitFactory {

	public static Fruit getFruit(String fruitStr) {
		Fruit fruit = null;
		switch (fruitStr) {
		case "apple":
			fruit = new Apple("british apple", "red");
			break;
		case "orange":
			fruit = new Orange("china orange", "orange");
			break;

		default:
			break;
		}
		return fruit;
	}

}
