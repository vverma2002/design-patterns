package com.simpleFactory.examples.eg2;

public class SimpleFactory {
	enum AnimalType {
		CAT, DOG
	}

	interface Animal {
		public String getAnimalTypeName();
	}

	static class Cat implements Animal {
		@Override
		public String getAnimalTypeName() {
			return "CAT";
		}
	}

	static class Dog implements Animal {
		@Override
		public String getAnimalTypeName() {
			return "DOG";
		}
	}

	static class AnimalFactory {
		public static Animal getAnimalFromEnum(AnimalType animalType) {
			Animal animal = null;
			if (AnimalType.CAT.equals(animalType)) {
				animal = new Cat();
			} else if (AnimalType.DOG.equals(animalType)) {
				animal = new Dog();
			}
			return animal;
		}
	}

	public static void main(String[] args) {
		Animal animal1 = AnimalFactory.getAnimalFromEnum(AnimalType.DOG);
		System.out.println(animal1.getAnimalTypeName());
		Animal animal2 = AnimalFactory.getAnimalFromEnum(AnimalType.CAT);
		System.out.println(animal2.getAnimalTypeName());
	}
}