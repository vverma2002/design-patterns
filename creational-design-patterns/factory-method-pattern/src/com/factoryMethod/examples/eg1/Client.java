package com.factoryMethod.examples.eg1;

public class Client {
	public static void main(String[] args) {
		
		GameFactory gf = new CheckersGameFactory();
		
		Game game1 = gf.getGame();
		Game game2 = new ChessGame();
		Game game3 = new CheckersGame();

		playGame(game1);
		playGame(game2);
		playGame(game3);
		
	}

	private static void playGame(Game game) {
		game.play();
	}

}
