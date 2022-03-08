package com.factoryMethod.examples.eg1;

public class ChessGame extends Game {

	@Override
	protected void play() {
		System.out.println("Playing Chess Game");
	}

	@Override
	protected void initialize() {
		System.out.println("Initialize Chess Game");
	}

}
