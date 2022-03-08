package com.factoryMethod.examples.eg1;

public class CheckersGame extends Game {

	public CheckersGame(int size) {
		this.size = size;
	}

	@Override
	protected void play() {
		System.out.println("Playing Checkers Game");
	}

	@Override
	protected void initialize() {
		System.out.println("Initialize Checkers Game for size " + size);
	}

}
