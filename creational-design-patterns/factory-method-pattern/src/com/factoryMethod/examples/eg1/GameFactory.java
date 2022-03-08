package com.factoryMethod.examples.eg1;

public abstract class GameFactory {

	// Factory Method
	protected abstract Game createGame();

	// Common Logic shared by all
	public Game getGame() {
		Game obj = createGame();
		obj.initialize();
		return obj;
	}
}
