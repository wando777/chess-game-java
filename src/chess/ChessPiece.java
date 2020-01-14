package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece{
	
	private Color color;
	
	// Constructor
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public ChessPiece() {
	}

	public Color getColor() {
		return color;
	}

	
}
