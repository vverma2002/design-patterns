package com.factoryMethod.examples.eg1;

public class CheckersGameFactory extends GameFactory {

	@Override
	protected Game createGame() {
		return new ChessGame(64);
	}

}
