package com.simpleFactory.examples.eg2;

public class Client {

	public static void main(String[] args) {

		Fruit f1 = FruitFactory.getFruit("apple");
		System.out.println(f1);
	}
}
