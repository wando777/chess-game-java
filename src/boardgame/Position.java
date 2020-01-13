package boardgame;

public class Position {

	// Attributes
	private int row;
	private int column;

	// Constructor
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public Position() {
	}

	// Getters & Setters
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	// toString
	@Override
	public String toString() {
		return row + ", " + column;
	}

}
