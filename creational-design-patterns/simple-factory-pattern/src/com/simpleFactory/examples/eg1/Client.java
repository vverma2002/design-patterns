package com.simpleFactory.examples.eg1;

public class Client {

	public static void main(String[] args) {

		Pet pet1 = PetFactory.getPet("DOG");
		Pet pet2 = PetFactory.getPet("CAT");
		pet1.makeSound();
		pet2.makeSound();
	}
}
