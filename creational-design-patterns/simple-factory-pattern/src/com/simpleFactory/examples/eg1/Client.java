package com.simpleFactory.examples.eg1;

public class Client {

	public static void main(String[] args) {

		Fruit f1 = new Apple("british apple", "red");
		System.out.println(f1.printFruitInfo());
		Fruit f2 = new Orange("china orange", "orange");
		System.out.println(f2.printFruitInfo());

		// new
		Fruit f3 = FruitFactory.getFruit("apple");
		System.out.println(f3.printFruitInfo());
		Fruit f4 = FruitFactory.getFruit("orange");
		System.out.println(f4.printFruitInfo());
	}
}
