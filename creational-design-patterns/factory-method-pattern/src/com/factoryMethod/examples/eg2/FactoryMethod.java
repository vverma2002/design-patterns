package com.factoryMethod.examples.eg2;

public class FactoryMethod {

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

	static abstract class AnimalProducer {
		abstract public Animal getAnimalType();
	}

	static class CatProducer extends AnimalProducer {
		@Override
		public Animal getAnimalType() {
			return new Cat();
		}
	}

	static class DogProducer extends AnimalProducer {
		@Override
		public Animal getAnimalType() {
			return new Dog();
		}
	}

	public static void main(String[] args) {
		AnimalProducer animal1 = new CatProducer();
		System.out.println(animal1.getAnimalType().getAnimalTypeName());
		AnimalProducer animal2 = new DogProducer();
		System.out.println(animal2.getAnimalType().getAnimalTypeName());
	}

}