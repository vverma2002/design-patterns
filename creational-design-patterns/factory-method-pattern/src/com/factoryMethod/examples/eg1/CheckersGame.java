package com.factoryMethod.examples.eg1;

public class CheckersGame extends Game {

	@Override
	protected void play() {
		System.out.println("Playing Checkers Game");
	}

	@Override
	protected void initialize() {
		System.out.println("Initialize Checkers Game");
	}

}
