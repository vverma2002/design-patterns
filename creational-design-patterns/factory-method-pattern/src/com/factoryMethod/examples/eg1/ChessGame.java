package com.factoryMethod.examples.eg1;

public class ChessGame extends Game {

	public ChessGame(int size) {
		this.size = size;
	}

	@Override
	protected void play() {
		System.out.println("Playing Chess Game");
	}

	@Override
	protected void initialize() {
		System.out.println("Initialize Chess Game for size " + size);
	}

}
