package com.factoryMethod.examples.eg1;

public class ChessGameFactory extends GameFactory {

	@Override
	protected Game createGame() {
		return new CheckersGame(20);
	}

}
