package com.factoryMethod.examples.eg1;

public class Client {
	public static void main(String[] args) {

		Game game1 = new ChessGame(64);
		game1.initialize();
		Game game2 = new CheckersGame(20);
		game2.initialize();

		/// With factory
		GameFactory gf = new CheckersGameFactory();
		Game game3 = gf.getGame();

		playGame(game1);
		playGame(game2);
		playGame(game3);

	}

	private static void playGame(Game game) {
		game.play();
	}

}
