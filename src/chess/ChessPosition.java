package chess;

import boardgame.Position;
import chess.ChessMatch;;

public class ChessPosition {

	private int row;
	private char column;

//	public ChessMatch chessMatch = new ChessMatch();
	private static final char FIRST_COLUMN = 'a';
	private static final int FIRST_LINE = 1;

	// Constructor
	public ChessPosition(char column, int row) {
		if (column < FIRST_COLUMN || column > (char) getBoardSize() + FIRST_COLUMN || row < FIRST_LINE
				|| row > getBoardSize()) {
			throw new ChessException("There is no position with these coordinates. Valid between a1 and h8");
		}
		this.row = row;
		this.column = column;
	}

	// Getters
	public int getRow() {
		return row;
	}

	public char getColumn() {
		return column;
	}

	// Methods

	public int getBoardSize() {
		return 8;
	}

	protected Position toPosition() {
		return new Position(8 - row, column - FIRST_COLUMN);
	}

	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char) (FIRST_COLUMN - position.getColumn()), 8 - position.getRow());
	}

	@Override
	public String toString() {
		return "" + column + row;
	}

}
