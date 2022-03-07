package com.simpleFactory.examples.eg1;

public class PetFactory {

	public static Pet getPet(String type) {
		Pet pet = null;
		switch (type) {
		case "CAT":
			pet = new PetCat();
			break;
		case "DOG":
			pet = new PetDog();
			break;
		default:
			break;
		}
		return pet;
	}
}
