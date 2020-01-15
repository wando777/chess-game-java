package boardgame;

public class Board {
	// Attributes
	private int rows;
	private int columns;
	private Piece[][] pieces;

	// Constructor
	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Error creating board: there must be more than ONE row and column.");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public Board() {
	}

	// Getters
	public int getRows() {
		return rows;
	}

	public int getColumns() {
		return columns;
	}

	// Methods
	public Piece piece(int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardException("Position not found on the board.");
		}
		return pieces[row][column];
	}

	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not found on the board.");
		}
		return pieces[position.getRow()][position.getColumn()];
	}

	public void PlacePiece(Piece piece, Position position) {
		if (thereIsAPieace(position)) {
			throw new BoardException("There is a piece at " + position + " already.");
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}

	private boolean positionExists(int row, int column) {
		return (row >= 0 && row < rows && column >= 0 && column < columns);
	}

	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}

	public boolean thereIsAPieace(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not found on the board.");
		}
		return piece(position) != null;
	}
}
