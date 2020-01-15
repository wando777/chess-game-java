package application;

import chess.ChessPiece;

public class UI {
	// User Interface: This class will show our mat as a board
	private static final int BOARD_SIZE = 8;

	public static void printBoard(ChessPiece[][] pieces) {
		for (int i = 0; i < pieces.length; i++) {
			System.out.print((BOARD_SIZE - i) + " ");
			for (int j = 0; j < pieces.length; j++) {
				printPiece(pieces[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}

	private static void printPiece(ChessPiece pieces) {
		if (pieces == null) {
			System.out.print("-");
		} else {
			System.out.print(pieces);
		}
		System.out.print(" ");
	}

}
