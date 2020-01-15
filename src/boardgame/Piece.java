package boardgame;

public class Piece {

	protected Position position;
	private Board board;

	// Constructor
	public Piece(Board board) {
		this.board = board;
	}

	public Piece() {
	}

	// Getter
	protected Board getBoard() {
		return board;
	}

}
